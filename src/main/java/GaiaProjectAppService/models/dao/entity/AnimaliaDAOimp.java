package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Animalia;
import GaiaProjectAppService.models.entities.User;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimaliaDAOimp extends GenericDAOHibernateImp<Animalia, Integer> implements AnimaliaDAO {

    private final static Logger LOGGER = Logger.getLogger(AnimaliaDAOimp.class.getName());

}
