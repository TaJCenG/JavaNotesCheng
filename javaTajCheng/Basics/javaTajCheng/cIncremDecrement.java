package javaTajCheng;

public class cIncremDecrement {

	public static void main(String[] args) {

//post increase a++        post decree a--

// pre increase ++a		   pre decree  --a
		
		
		
		//Both are same ?
	int a = 5;
	a++;
	System.out.println(a);  //6
	
	
	int a1 = 5;
	++a1;
	System.out.println(a1);  //6
////////////////////////////////////////////////////////////////////////////////////////////			

	
	int a2 = 5;
	int b = 0;                            // value will increased and be assigned first
	b= a2++;
	System.out.println("a2" + a2);  //6
	System.out.println("b" + b);  //5
		
	int a3 = 5;
	int b1 = 0;                            // first assign the value
	b1= ++a3;
	System.out.println("a3 " + a3);  //6   // here increment happend first this 5 will be 6 first then given too b1 as 6
	System.out.println("b1 " + b1);  //6			
///////////////////////////////////////////////////////////////////////////////////////////		
		
	int z = 5;
	int x = 0;
	x = z++ + z++ + ++z + ++z;
// 0 = 5+1 + 6+1 + 1+7 + 1+8
//     5 + 6+ 8 +	9
	// x= 
	System.out.println("z " + z);//9
	System.out.println("x " + x);//28	
		
	/*Increment happen post 
	 * 
	 * It uses Z as it is then it will increase 5-6 same
	 * Post increment happening it will go 6-7
	 * 
	 * next pre-increment 
	 * 
	 * First it increase the value later it used as 7-8
	 * z++ here it uses the value and increase
	 * 
	 * 
	 * 
	 * 
	 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
	int f = 5;
	int g = 0;
	g = f++ + ++f + --f + f-- + f++;
	//   5   6     6    6      5
	System.out.println("f " + f);//6
	System.out.println("g " + g);//29
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
//Naming Conversion		
//	Variable : a, b, c,   abc   age   salary
//	
//	class : tajcheng    Book     anything
//	
//	Method : Print    check    assign
//	
//	Methods : it should be in action
//	            getAge    setAge
//		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
