import java.time.LocalDate; 
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.Save(new Customer(1,"�rfan","�zt�rk",LocalDate.of(1999, 05, 12),"221212121")); 
			
			//mersis do�rulama kald�
		
	}

}
