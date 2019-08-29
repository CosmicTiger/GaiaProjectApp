package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.Veterinary;

import java.util.logging.Logger;

public class ViaticDAOImp extends GenericDAOHibernateImp<Veterinary, Integer> implements VeterinaryDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
