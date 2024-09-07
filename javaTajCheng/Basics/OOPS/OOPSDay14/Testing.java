package OOPSDay14;

public class Testing {
	public static void main (String [] args) {
		//creating dependent object
		Account acc = new Account();
		
		//Performing setter injection to inject values
		acc.setAccName("Taj");
		acc.setAccNo("1");
		acc.setAccType("Savings");
		
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Taju");
		emp.setAddress("India");
		
		//Performing setter injection to Account
		emp.setAccount(acc);
		
		//checking the data of employee to see wheether injection happened or not
		emp.display();
	}

}
