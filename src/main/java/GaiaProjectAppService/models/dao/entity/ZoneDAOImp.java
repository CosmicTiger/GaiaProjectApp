package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Zone;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZoneDAOImp extends GenericDAOHibernateImp<Zone, Integer> implements ZoneDAO {

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());

    @Override
    public Zone findByZoneCode(String zoneCode) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();

        try {

            Query query = session.createQuery("SELECT z.zoneCode, z.extension, z.nameZone, z.description FROM Zone z WHERE z.zoneCode = :zoneCode")
                    .setParameter("zoneCode", zoneCode);
            List<Zone> entities = query.list();

            return !entities.isEmpty() ? entities.get(0) : null;
        } catch (ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new BussinessException(cve);
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        }
    }
}
