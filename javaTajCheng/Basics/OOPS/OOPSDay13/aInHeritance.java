package OOPSDay13;

public class aInHeritance {
	/*
	 * To run code we dont neeed java file we just need class file
	 * 
	 * Single              Multi            multiple
	 * 
	 * Ambiguity problem
	 * 
	 * By default every class parent is object
	 * 
	 * Inherited Method : some features which are inheriting from parent and in the child class we are using it as it is
	 * 
	 * Overridden methods : modified in child as pre-needed
	 * 
	 * As a child we get from parents like geans if my parent is short i will be short.
	 * 
	 * Specialized:- some method that are not available in parent class only available in child class is specialized
	 * 
	 * 
	 * PARENT CLASS METHODS :- Height, cloor, nose
	 * Child CLAss Methods  :- Height, color, nose,   swimming, smoking  these two are specialized
	 * 
	 */
	
	
	//Parent , super , base class  Non-Static 
	 class Akash{
		public int add(int num1, int num2) {
			int num3 = num1 + num2;
			return num3;
		}
	}

	//Single-level / Child, sub-derived   Non-Static 
	 class pavan extends Akash{
		public int sub(int num1, int num2) {
			int num3 =num1 - num2;
			return num3;
		}
	}
	
	//multi-level Inheritance  Non-Static 
	 class Mahesh extends pavan{
		public int multi(int num1, int num2) {
			int num3 =num1 * num2;
			return num3;
		}
	}
	 
	 public static void main(String [] args) {
		 aInHeritance outer = new aInHeritance();  //an instance of the outer class 
			Mahesh mah = outer.new Mahesh();
			int result1 = mah.add(4, 6);
			int result2 = mah.sub(4, 6);
			int result3 = mah.multi(4, 6);
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
		}
	}

