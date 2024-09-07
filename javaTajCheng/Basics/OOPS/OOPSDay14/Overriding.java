package OOPSDay14;
public class Overriding{
	
	/*
	 * Parent class  => Base class -> are same
	 * Child class => sub class => derived -> are same
	 * 
	 * we achieve parent - child relationship through EXTENDS keyword
	 * This also can be called as IS-A relationship   |  has-A relationship
	 * 
	 * When we use EXTENDS what ever in Parent will gets into child but i dont like or the requirement is different so
	 * I'M overriding it. we can override the body but there some restrictions 
	 * we cant override how-ever we want need to follow some rules
	 * 
	 * 
	 * public    |    visibility
	 * protected |    decreasing
	 * default   |
	 * private   - It is restricted to only class
	 * 
	 * 
	 */
	
	//we cannot reduce visibility but we can increasing
	//return type of overriden methods must be same as that of parent
	//Retrun type can be different if & only if  it is co-variant return type 
	//if passing parameter must be the same
	// THESE ARE THE RULES TO CONSIDER OVERRIDING METHOD
	
	class plane{
		protected void fly() {
			System.out.println("Plane is flying");
		}
	}

	
	class cargoPlane extends plane{                          
		public void fly() {                                  // this class having same as of parent so overriding method
			System.out.println(" cargoPlane Plane is flying lower");
		}
	}
	
	
	//we cannot reduce visibility but we can increasing
		class Plane{
			protected void fly() {
				System.out.println("Plane is flying");
			}
		}

		
		class CargoPlane extends Plane{                          
			public void fly() {                                  
				System.out.println(" cargoPlane Plane is flying lower");
			}
		}
	
	
	
	
	
	

}
