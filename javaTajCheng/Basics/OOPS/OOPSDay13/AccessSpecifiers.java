package OOPSDay13;

public class AccessSpecifiers {
	/*
	 *  4 Access Specifiers / Modifiers
	 *  public,  protected,  default,  private :- used in class,  method, variable
	 * 
	 * In one project there may be multiple task multiple class, If there are multiple classes we divide it into packages
	 * 
	 * Package :- add, sub, div
	 * 
	 * Packages inheritance :->
	 * 
	 * 
	 *            within-a-same-class       outside-class-same-package     outside-package-but-child-class  outside-package no-relationship
	 * public      ✔                        ✔                                         ✔                             ✔
	 * protected   ✔                        ✔                                         ✔                             ✖
	 * default     ✔                        ✔                                         ✖                             ✖
	 * private     ✔                        ✖                                         ✖                             ✖
	 * 
	 * If you make any thing(A variable or method) as public we can access that particular mem of a class in package or anywhere
	 * (with in same project we can access)
	 * 
	 * As a child class we see some methods in the parent if we see same again in the child it is called in child class as overriden methods
	 * 
	 * INHERITED :- It is a method which got inherited in the child class and in the child class we are using as it is & not modifying it 
	 * 
	 * UPCASTING:- creating parent type reference for child    Plane p = new cargoPlane();
	 * 
	 * Down casting:- Temperery converting parent behavior to child type is down casting ((cargoPlane) (p)).CarryGoods();
	 * 
	 * we cant Access specialized characteristics through parent ref we have to change it to temporary as cargoPlane)cp.carryGoods. 
	 * this is downcasting
	 */
	
	
	
	public class plane{
		public void fly() {
			System.out.println("Plane is flying");
		}
		public void takeOff() {
			System.out.println("Plane is Landing");
		}
	}

	
	class cargoPlane extends plane{                          //In backend the parent class will be in child class we cant see
		public void fly() {                                  // not happy with parent class so modifying or based on requirement modifying
			System.out.println(" cargoPlane Plane is flying lower");
		}
		public void CarryGoods() {
			System.out.println("cargoPlane is CarryGoods");
		}
	}
	
	class PassengerPlane extends plane{
		public void fly() {
			System.out.println(" PassengerPlane Plane is flying Higher");  //overridden
		}
		public void CarryPassenger() {
			System.out.println("PassengerPlanePlane Carry Passengers");
		}
	}
	
	public static void main (String [] args) {
		AccessSpecifiers a = new AccessSpecifiers();
		plane p = a.new cargoPlane();
		p.fly();
		p.takeOff();
		((cargoPlane) (p)).CarryGoods();  //down casting due and accessing specialized properties
		plane pp = a.new PassengerPlane();
		pp.fly();
		pp.takeOff();

	}
	
	
	
	
	
	
	
	
}
