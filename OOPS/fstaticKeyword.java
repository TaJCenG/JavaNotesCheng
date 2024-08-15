package OOPS;

public class fstaticKeyword {
	/*
	 * when ever we create variable using static keyword that variable can access from non static also
	 * 
	 * NON- Static data cannot be used in static method because there is no well defined variable to operate on.
	 * 
	 * Memory allocate in heap area
	 * 
	 * purpose of static block:
	 * want to execute something before main method that code write in static block
	 * To initialize values for static variables
	 * 
	 * 
	 * static variables also called as class variables because one copy of data will be shared among all the objects of the class
	 * 
	 * If a method is not static object creation is compulsory to access
	 * 
	 * 
	 */

	
	static int a,b,c;
	//static block   no need to call
	static {
		System.out.println("static Block");
		
		a = 10;
		b=9;
		c=8;
	}
	
	static void disp() {
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	public static void main(String [] args) {
		System.out.println("main method");
		disp();
	}
	
	/*
	 * we are thinking that our program is executing from main method but its not true
	 * 
	 * 1st the static variables will execute
	 * 2 static block
	 * 3 static method
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
