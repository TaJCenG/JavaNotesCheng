package OOPSDay14;

public class EmployeeOne {
	
	private int id;
	private String name;
	private String address;
	
	//HAS - A variable injection
	private AccountOne account;

	//performing constructor injection
	public EmployeeOne(int id, String name, String address, AccountOne account) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.account = account;
	}
	
	public void display() {
		System.out.println("Employee :: display method called");
		System.out.println("******** Employee Details are *******");
		System.out.println("Employee ID : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Address : " + address);
		System.out.println("******** Account Details are *******");
		System.out.println("Account NO : " + account.getAccNo());
		System.out.println("Account Name : " + account.getAccName());
		System.out.println("Account Type : " + account.getAccType());
	}

}
