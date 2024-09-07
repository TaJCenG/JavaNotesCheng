package OOPSDay14;


public class ExPoly {

	public static void main(String[] args) {
		Child c = new Child();
		SecondChild s = new SecondChild();
		grandParent g = new grandParent();

		g.permit(c);  //polymorphism
		g.permit(s);
		}
	
}		
	class Parent{
		public void fly() {
			System.out.println("Parent is Sleeping");
		}
		public void takeOff() {
			System.out.println("Parent is cooking");
		}
	}
	
	class Child extends Parent{                          
		public void fly() {                                 
			System.out.println(" Child Plane is plying ");
		}
		public void CarryGoods() {
			System.out.println("Child is Carrying Goods");
		}
	}
	
	class SecondChild extends Parent{
		public void fly() {
			System.out.println(" SecondChild is playing");  //overridden
		}
		public void CarryPassenger() {
			System.out.println("SecondChild is sleeping");
		}
	}
	
	class grandParent {
		public void permit(Parent p) {  //if we give another name it will execute that only other wont
			p.fly();
			p.takeOff();
		}
	}
	
	
	

	

