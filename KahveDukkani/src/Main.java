import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Muhittin", "Mýzrak", "15961236458", new Date(1995, 8, 8)));
		System.out.println();
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.save(new Customer(1, "Hasan", "Hasan", "15963", new Date(1995, 8, 8)));
	}

}