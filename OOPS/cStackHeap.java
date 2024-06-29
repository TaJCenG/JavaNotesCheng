package OOPS;

 class LaunchCalculator {

	/*Two major Memory areas : 1.Stack  2.Heap
	 * 
	 * After program stop memory deallocate in HEAP AREA no one is referring HEAP AREA so GARBAGE will collect object
	 * GARBAGE collector is only responsible for HEAP AREA
	 * 
	 * We cannot use VOID and RETURN in same it will get error
	 * 
	 * Based on our requirement we can write a method how ever we want
	 * we can write a method which is not accepting parameters & not returning also
	 * we can write a method which is expecting parameters not returning anything
	 * we can write method not expecting parameter but returning something
	 * we can write a method which is expecting some parameters & returning also because if we call that method from that method 
	 * --we can collect values also
	 * 
	 * 
	 * 
	 */
	
	int a;
	int b;
	void add(){
		int c = a+b;
		System.out.println(c);
	}}
	public class cStackHeap{
		public static void main (String [] args) {
			LaunchCalculator calc = new LaunchCalculator();
			calc.add();
		}
	}

