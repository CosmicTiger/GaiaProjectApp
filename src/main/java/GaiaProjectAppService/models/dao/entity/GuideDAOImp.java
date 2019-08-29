package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Guide;

import java.util.logging.Logger;

public class GuideDAOImp extends GenericDAOHibernateImp<Guide, Integer> implements GuideDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());

}
