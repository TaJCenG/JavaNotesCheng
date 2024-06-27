package javaTajCheng;

public class ddIF_Condi {
/*
 * 
 * U execute a statement everything is going in a sequence at a sudden point there is condition whether u have to choose
 * this or that for that we use condition statement
 * 
 * 
 */
	public static void main(String[] args) {

		boolean result = 8 > 7;    // boolean just give true or false
		if (result) {
			System.out.println(result);//true
		}
		else System.out.println(result); // if having one statement no need to use {} bra

		
		int n = 8;
		int n1 = 6;
		
		if(n > n1) {
			System.out.println( "n is greater");
		}
		else System.out.println("n1 is greater");
		
		
		int a = 4;
		if (a ==4) {
			a ++;
			System.out.println(" a is increased : " + a);
		}
	else 
		System.out.println( " not increases");
	
	}
	
		
		boolean a = true;
		boolean b = false;
		{
		if(a) {
			System.out.println("a is true");
		}else System.out.println("a is false");
		
		if(b) {
			System.out.println("b is true");
		}else System.out.println("b is false");
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
