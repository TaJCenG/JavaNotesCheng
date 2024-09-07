package OOPSDay14;

public class AccountOne {

	//instance variables
	private int accNo;
	private String accType;
	private String accName;
	
	//performing constructor injection
	public AccountOne(int accNo, String accType, String accName) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.accName = accName;
	}
	
	//sending data to the users
	public int getAccNo() {
		return accNo;
	}
	public String getAccType() {
		return accType;
	}
	public String getAccName() {
		return accName;
	}
}
