package OOPSDay14;

public class TestingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an dependent object through constructor
		AccountOne account = new AccountOne (1, "Savings","Taj");
		
		//Create a target object and inject the dependent object in the constructor
		EmployeeOne emp = new EmployeeOne(2, "Taju", "India", account);
		
		//checking the data of employee to see whether injection happened or not
		emp.display();
		

	}

}
