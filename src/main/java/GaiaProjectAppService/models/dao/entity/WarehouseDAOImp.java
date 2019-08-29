package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Warehouse;

import java.util.logging.Logger;

public class WarehouseDAOImp extends GenericDAOHibernateImp<Warehouse, Integer> implements WarehouseDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
