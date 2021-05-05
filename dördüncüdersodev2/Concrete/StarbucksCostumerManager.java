package Concrete;

import Abstract.BaseCostumerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCostumerManager extends BaseCostumerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCostumerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer){
        if(customerCheckService.checkPerson(customer)){
            System.out.println("saved to database: "+customer.getFirstName());
        }
        else {
            System.out.println("Not a valid person: "+customer.getFirstName());
        }
    }
}
