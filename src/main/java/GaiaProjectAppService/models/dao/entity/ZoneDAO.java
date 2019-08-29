package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDao;
import GaiaProjectAppService.models.entities.Zone;

public interface ZoneDAO extends GenericDao<Zone, Integer> {

    Zone findByZoneCode(String zoneCode) throws BussinessException;

}
