package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.SaleDetail;

import java.util.logging.Logger;

public class SaleDetailDAOImp extends GenericDAOHibernateImp<SaleDetail, Integer> implements SaleDetailDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
