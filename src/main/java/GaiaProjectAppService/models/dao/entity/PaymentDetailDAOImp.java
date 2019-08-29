package GaiaProjectAppService.models.dao.entity;

import GaiaProjectAppService.models.dao.GenericDAOHibernateImp;
import GaiaProjectAppService.models.entities.PaymentDetail;

import java.util.logging.Logger;

public class PaymentDetailDAOImp extends GenericDAOHibernateImp<PaymentDetail, Integer> implements PaymentDetailDAO{

    private final static Logger LOGGER = Logger.getLogger(UserDAOImp.class.getName());
}
