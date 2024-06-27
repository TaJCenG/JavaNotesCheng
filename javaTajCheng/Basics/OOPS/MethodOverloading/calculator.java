package OOPS.MethodOverloading;

public class calculator {
// public static void main (String [] args) {
//	 int a =5;
//	 int b =6;
//	 int res = a+b;
//	 System.out.println(res);//11
// }
 
 /*
  * No need to write everything in main method
  * we can use delegate method( it gives someone else to do the job)
  */
 
// public int add (int a, int b) {
//	 int res = a+b;
//	 return res;
// }
// public	class calc{
//		public static void main(String [] args) {
//			int a =20;
//			int b =20;
//			calculator cal = new calculator();
//			int res = cal.add(a, b);
//			System.out.println(res);
//		}
//	}

	
	/*
	 * Method with same name But different parameters
	 * 
	 * When you have two methods with same name but having different parameters is METHOD_OVERLOADING
	 */
	
	
public int add(int a, int b) {
	int res = a+b;
	return res;
}
public double add(int a, int b, int c) { // method overloading  method created  diff paramaters
	int res = a+b+c;
	return res * 2;
}
public class cal{
	public static void main(String [] args) {
		int a = 4;
		int b= 5;
		int c = 6;
		calculator calc = new calculator(); //object created
		int res = calc.add(a, b);
		double res1 = calc.add(a, b, c);
		System.out.println(res);  //9
		System.out.println(res1);  //30.0
	}
}




















}

