import java.io.IOException;

public class StarbucsCustomerManager extends BaseCustomerManager {
	 
	
	private CustomerCheckService customerCheckService;
	public  void Save(Customer customer)  {
		
		//CheckIfRealPerson(customer);
		if(customerCheckService.CheckIfRealPerson(customer)) {
		
			System.out.println("Saved to db: "+customer.FirstName);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

	private void CheckIfRealPerson(Customer customer) {
		
		
	}
	
}
