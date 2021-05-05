import Abstract.BaseCostumerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCostumerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) {

        BaseCostumerManager baseCostumerManager=new StarbucksCostumerManager(new CustomerCheckManager());
        baseCostumerManager.save(new Customer(1,"Engin","Demiroð","1990","12345678911"));

        System.out.println("");

        baseCostumerManager.save(new Customer(1,"Engin","Demiroð","1990","123"));
    }
}
