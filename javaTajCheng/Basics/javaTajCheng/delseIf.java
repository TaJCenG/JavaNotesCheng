package javaTajCheng;

public class delseIf {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 0;
		
		if ( a > b && b > c) {
			System.out.println(a);
		}
		else if( b>a && b>c) {
			System.out.println(b);
		}
		else if( c>a && c>a) 
			System.out.println(b);
		
		else System.out.println("nothing is greater ");
	
System.out.println("//////////////////////////////////////////////");
		
		int age = 17;
		
		String ok = "Elgible";
		String no = "Not Eligble";
		
		if (age > 18) {
			System.out.println(ok);
		}
		else System.out.println(no);
		System.out.println("//////////////////////////////////////////////");		
		
		int age1 = 17;
		
		String ok1 = null;
		
		if (age1 > 18) {
			ok1 = "Eligble";
		}
		else 
			ok1 = "Not Eligble";	
		
		System.out.println(ok1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
