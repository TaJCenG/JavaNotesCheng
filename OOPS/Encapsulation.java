package OOPS;


public class Encapsulation {
	
	public static void main(String[] args) {


		/*
		 * Encapsulation :- Something related to that itself
		 * 
		 * Encapsulation is the process of hiding internal details and providing a public interface to
		 *               interact with an object. It helps in achieving data abstraction and protects data from
		 *               unauthorized access.
		 * 
		 * Binding (or wrapping) code and data together into a single unit are known as encapsulation.
		 * For example, a capsule, it is wrapped with different medicines
		 * 
		 * 
		 * ========================================================================================
		 * 
		 * Class has 2 imp parts
		 * 1.property | variable : has Data ->imp
		 * 2.behavior | methods | does task
		 * 
		 * USES ::->
		 * Providing security to most imp part of our object
		 * Providing controlled access to the most imp component of the class
		 * By making use of setter, getters & private keywords avoiding direct access.
		 * 
		 *  
		 */
		
		
		
		class books{   //open property any one can access
			int pgNo;  //--->property
		}
		books b = new books();
		b.pgNo = 100;
		System.out.println(b.pgNo);
			
	// REAL LIFE EXAMPLE   :: In pen INK is imp , so we cover the pen by cap which is security 	
		System.out.println("==============================================================");			
		
		class book{   
			private int pgNo;  //--->Providing security. outside of the class no one can access this property
		}	

		System.out.println("==============================================================");			
		
		class bok{  
			 int pgNo;  
		
		public void setpgNo(int x) { // this method take values from outside 
			pgNo =x;
		}
		public int getpgNo() {
			return pgNo; // returning something
		}
		
		}	
	bok bo = new bok();
	bo.setpgNo(3);
	System.out.println(bo.getpgNo());
		
	System.out.println("==============================================================");			
		
		
		
	class Taj{
		private int age;
		private String name;
		
		public void setAge(int x) {
			age = x;
		}
		public void setName( String X) {
			name = X;
		}
		public int getAge() {
			return age;	
		}
		public String getName() {
			return name;	
		}
	}
		Taj t = new Taj();
		t.setAge(23);
		t.setName("TajCheng");
		System.out.println("Name : " +t.getName());
		System.out.println("Age  : " +t.getAge());
	
	
	System.out.println("==============================================================");			
	
		
	}		
	}


