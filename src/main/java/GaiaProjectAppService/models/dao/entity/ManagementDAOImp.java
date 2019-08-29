package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Management;

import java.util.logging.Logger;

public class ManagementDAOImp extends GenericDAOHibernateImp<Management, Integer> implements ManagementDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
