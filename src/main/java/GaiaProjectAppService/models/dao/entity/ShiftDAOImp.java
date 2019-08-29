package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Shift;

import java.util.logging.Logger;

public class ShiftDAOImp extends GenericDAOHibernateImp<Shift, Integer> implements ShiftDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
