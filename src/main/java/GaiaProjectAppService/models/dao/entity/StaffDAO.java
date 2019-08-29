package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.exceptions.BussinessException;
import GaiaProjectAppService.models.dao.GenericDao;
import GaiaProjectAppService.models.entities.Staff;

public interface StaffDAO extends GenericDao<Staff, Integer> {

    Staff findByStaffCode(String staffCode) throws BussinessException;
}
