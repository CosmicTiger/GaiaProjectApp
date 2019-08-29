package GaiaProjectAppService.models.dao.entity;


import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Botanic;
import GaiaProjectAppService.models.entities.User;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BotanicDAOimp extends GenericDAOHibernateImp<Botanic, Integer> implements BotanicDAO {

    private final static Logger LOGGER = Logger.getLogger(BotanicDAOimp.class.getName());

    @Override
    public Botanic findByBotanicDAO(String BotaniCode) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();

        try {

            Query query = session.createQuery("SELECT s.staff_code, s.first_name, s.lastName_primary, b.role FROM Staff s INNER JOIN Botanic b ON s.staffId = b.staffId WHERE s.staffCode = :staffCode")
                    .setParameter("BotaniCode", BotaniCode);
            List<User> entities = query.list();

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