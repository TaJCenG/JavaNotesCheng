package OOPSDay14;

public class Employee {

	//instance variables
	private int id;
	private String name;
	private String address;
	
	//HAS-A variable injection
	private Account account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
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
