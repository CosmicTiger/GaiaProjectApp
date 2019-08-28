package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.Exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDao;

public interface UserDAO extends GenericDao <User, Integer>{

    User findByUserName(String userName, String password) throws BussinessException;

}
