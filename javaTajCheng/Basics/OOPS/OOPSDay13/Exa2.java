package OOPSDay13;

public class Exa2 {
		public static void main (String [] args) {
			Exa2 outer = new Exa2();
			
			B object = outer.new B();
			object.show();
			object.printIvalue();
		}
	
	int i = 5;
	public void show(){
		System.out.println("in Show");
	}

	class B extends Exa2{
		int i = 6;
		public void printIvalue() {
			int i =9;
			System.out.println(i);
		    System.out.println(this.i);
		    System.out.println(super.i);
		}
	}
}
