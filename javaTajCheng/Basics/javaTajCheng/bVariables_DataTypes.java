package javaTajCheng;

public class bVariables_DataTypes {

	// Public can be called from any where
	public static void main(String [] args) {
		 //static :: we dont need object to call mail
		 // main :: starting point JVM needs to give output
		
		int a = 10;  // 10 is storing in a :: what ever in right side storing in left ot giving to left
		// int a = 10 we need to specify the data in java because it is statically type
		
		
	//	Primitive data types  :: for effective utilization of memory we use primitive
		
		// Char ::  a b c d @                            Float double :: 70.25
	   //LONG Boolean byte 
		
		// in java for char 2-bytes of memory allocated
		//UTF :: unicode transo format java follows
		// to store any character 2 bytes memory allocated
		
		
		//byte has -128 to +127 value so we can save upto in byte
	   byte a1 = 127; // if give more than 127 it asks to change the data type to int
	   
	   // java has 4 primitive data types
	   //  byte :1   Short :2      INT :4     long :8
	   int a2 = 4444444;
	   
	   //int is datatype :: a2 is variable name  :: = is assignment operator   :: 444 value/literal
	   
	   // boolean does not sote any data type
	   
	   //Type Casting : Converting one data type to another data type 
	   
	   byte a3 = 10;
	   double b;                // this is implict type casting which automatically convert
	   b=a;
	   System.out.println(b);
	   
	   
	   
	   double a4 = 10.0;
	   byte b1;                // byte b1; it will give error 
	   //b1=a4;
	   b1 = (byte) a4;                 // with help of explict we can solve but it has data lost precision
	   System.out.println(b1);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
}
