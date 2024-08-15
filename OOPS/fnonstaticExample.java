package OOPS;

public class fnonstaticExample {

	static int a,b,c;
	//static block   no need to call
	static {
		System.out.println("static Block");
		
		a = 10;
		b=9;
		c=8;
	}
	
	static void disp() {
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
int e,f,g;
{
	e = 10;
	f=9;
	g=8;
	a = 20;
	b=91;
	c=81;
}


void displ() {
	
	System.out.println("non Static method");
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}


public static void main(String [] args) {                   //if no static bloc this needs to be print first
	System.out.println("main method");
	disp();
	
	fnonstaticExample  l = new fnonstaticExample();
	l.displ();
}







}
