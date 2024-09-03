package OOPSDay13;

public class Exa3 {

	class Parent{
		private String name;
		private int age;
		Parent(){
			System.out.println("parent class");
		}
	}
	
	class sub extends Parent{
		sub(){                                //in backend there is super method 
			System.out.println("Child Class");
		}
	}
	
	public static void main (String [ ] args) {
		Exa3 b = new Exa3();
		sub a = b.new sub();
		
	}
	
}


/*
 * Extends :: What ever in class Parent that sit in Sub/child class too except private
 * 
 * Private member of a class will not participate in inheritance Because To preserver something as called Encapsulation
 * 
 * Constructor will not get inherited.
 * But it is getting executed because of the super method present in child class constructor
 * 
 * 
 * 
 * 
 * 
 * 
 */