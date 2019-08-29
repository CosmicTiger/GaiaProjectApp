package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Supply;

import java.util.logging.Logger;

public class SupplyDAOImp extends GenericDAOHibernateImp<Supply, Integer> implements SupplyDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
