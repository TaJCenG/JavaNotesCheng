package javaTajCheng;

public class fTernary {

	public static void main(String[] args) {
	int age = 17;
		
//		String ok1 = null;
//		
//		if (age1 > 18) {
//			ok1 = "Eligble";
//		}
//		else 
//			ok1 = "Not Eligble";	
//		
//		System.out.println(ok1);
		
		
		
	String ok = age >= 18 ? "Eligble" : "Not Eligble";
	// if true after ? will be printed
	//else after :
	System.out.println(ok);
		
	int	a =10;
	int	b=21;
	
	boolean ans = a>b ? a<b : a==b;
		System.out.println(ans);

	}

}
