package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDao;
import GaiaProjectAppService.models.entities.Botanic;


public interface BotanicDAO extends GenericDao<Botanic, Integer> {

    Botanic findByBotanicDAO(String BotaniCode) throws BussinessException;

}
