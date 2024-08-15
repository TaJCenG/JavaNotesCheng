package simpleProject;

import java.util.Scanner;



	class Farmer{
		private float pa; //principa
		private int td;   //Time duration
		private float si;  //simple intrest
		private static float ri;   //memory allocate once for static
		                           //common data sharing with all the object so use static efficient way to write a program
		
		static {
			ri = 2.5f; //rate of intrest
		}
		
		public void acceptInput() {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Please Enter the Loam Amout you need");
			pa = sc.nextFloat();
			System.out.println("Please Enter the time to repay");
			td=sc.nextInt();
		}
		
		public void compute() {
			si=(pa*td*ri)/100;   //sample formula according to me
		}
		
		public void disp() {
			System.out.println("Simple Intrest is :"+si);
		}			
	}
	public class Loan {
	public static void main(String[] args) {
		Farmer l = new Farmer();
		Farmer l1 = new Farmer();
		 
		 l.acceptInput();
		 l.compute();
		 l.disp();
		 
		 l1.acceptInput();
		 l1.compute();
		 l1.disp();

	}

}
