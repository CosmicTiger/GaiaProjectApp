package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Association;
import GaiaProjectAppService.models.entities.User;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AssociationDAOimp extends GenericDAOHibernateImp<Association, Integer> implements AssociationDAO {

    private final static Logger LOGGER = Logger.getLogger(AssociationDAOimp.class.getName());


}
