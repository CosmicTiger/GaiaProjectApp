package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Caretaker;

import java.util.logging.Logger;

public class CaretakerDAOImp extends GenericDAOHibernateImp<Caretaker, Integer> implements CaretakerDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
