package GaiaProjectAppService.Exceptions;

import org.hibernate.exception.ConstraintViolationException;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BussinessException extends Exception {

      private Set<BussinessMessage> bussinessMessages = new TreeSet<>();

      public BussinessException(List<BussinessMessage> bussinessMessages) {
        this.bussinessMessages.addAll(bussinessMessages);
      }

      public BussinessException(BussinessMessage bussinessMessage) {
          this.bussinessMessages.add(bussinessMessage);
      }

      public BussinessException(Exception ex) {
          bussinessMessages.add(new BussinessMessage(null, ex.toString()));
      }

      public BussinessException(ConstraintViolationException cve) {
         bussinessMessages.add(new BussinessMessage(null, cve.getLocalizedMessage()));
      }

      public Set<BussinessMessage> getBussinessMessages() {
         return bussinessMessages;
     }

}