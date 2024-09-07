package OOPSDay14;

public class Department {
	
	private Integer deptNo;
	private String deptName;
	private String deptLoc;
	private DepartmentEmployee [] dE;
	public Department(Integer deptNo, String deptName, String deptLoc, DepartmentEmployee[] dE) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.dE = dE;
	}
	
	public void display() {
		System.out.println("Department :: display method called");
		System.out.println("******** Department Details are *******");
		System.out.println("Department No : " + deptNo);
		System.out.println("Department Name : " + deptName);
		System.out.println("Department Address : " + deptLoc);
		
		for(DepartmentEmployee emp : dE) {
			
		
		System.out.println("******** DepartmentEmployee Details are *******");
		System.out.println("DepartmentEmployee Id : " + emp.getId());
		System.out.println("DepartmentEmployee Name : " + emp.getName());
		
	}
	}
	
	

}
