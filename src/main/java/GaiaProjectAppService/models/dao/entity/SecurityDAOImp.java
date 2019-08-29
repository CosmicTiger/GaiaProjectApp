package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Security;

import java.util.logging.Logger;

public class SecurityDAOImp extends GenericDAOHibernateImp<Security, Integer> implements SecurityDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
