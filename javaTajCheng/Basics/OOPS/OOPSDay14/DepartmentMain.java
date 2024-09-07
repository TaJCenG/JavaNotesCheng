package OOPSDay14;

public class DepartmentMain {

	public static void main (String [] args) {
		
		DepartmentEmployee d = new DepartmentEmployee(1, "Taj");
		DepartmentEmployee e = new DepartmentEmployee(2, "Arif");
		DepartmentEmployee f = new DepartmentEmployee(3, "Taju");
		
		DepartmentEmployee []emp = new DepartmentEmployee[3];
		
		emp[0] = d;
		emp[1] = e;
		emp[2] = f;
		
		Department dp = new Department(123, "Bcci", "India", emp);
		
		dp.display();
	}
}
