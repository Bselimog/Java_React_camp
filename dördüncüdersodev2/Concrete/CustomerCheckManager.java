package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkPerson(Customer customer) {
        if(customer.getNationalityId().length()==11){
            return true;
        }
        else {
            return false;
        }
    }
}
