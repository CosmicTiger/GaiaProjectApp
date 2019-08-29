package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Staff;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StaffDAOImp extends GenericDAOHibernateImp<Staff, Integer> implements StaffDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());

    @Override
    public Staff findByStaffCode(String staffCode) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();

        try {

            Query query = session.createQuery("SELECT s.staffCode, s.firstName, s.lastNamePrimary FROM Staff s WHERE s.staffCode = :staffCode")
                    .setParameter("staffCode", staffCode);
            List<Staff> entities = query.list();

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
