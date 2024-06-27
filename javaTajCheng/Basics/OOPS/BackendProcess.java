package OOPS;



	/*To develop a java Project we need JDK
	 * 
	 * JDK  has  JRE (java runtime environment)
	 * 
	 * JRE  has  JVM  ( Responsible to execute our java Program on app)
	 * 
	 * RUNTIME DATA PROCESS :-
	 * {
	 * Method Area  : Method()
	 * Heap  : Object, variable creation
	 * Stack  : Local variable refer called method
	 * }
	 * 
	 * Executable Engine {
	 * 
	 * Interpreter + JIT(Just In Time) compiler + Garbage Collector
	 * }
	 * 
	 * Backend Process How Program run {
	 * 
	 * Ram -> JRE -> JVM in JVM Library Tools -> it will come to class -> In class loader there are data areas for variables, object ->
	 * It will start execute in executable engine -> This known as interpreter It will compile the code 1 by 1
	 * }
	 * 
	 * {
	 * When ever we create objects memory will be in heap area
	 * when ever there is local variable and called to a method is in stack area.
	 * }
	 * 
	 * Instance variable  &  Local Variable{
	 * It depends where we have written them
	 * 
	 * If we written directly variables within a class is called :: "Instance"
	 * if we dont give values JVM set default as zero
	 * 
	 * Inside a method written so it is :: "Local"
	 * default values not be given
	 * }
	 * 
	 * When ever control comes to any method that method if it was to be executed once record will be created in "Stack Area"
	 * Creating a Object on heap area JVM allocate 1 memory allocation
	 * 
	 * 
	 * MEthods {
	 *  Any Task/ anything is going to be use with method
	 *  In OOP anything has to be done in method
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	class Instance{
	int a = 10;       //Instance variable
	double b = 20.5; 
	}
	
	class Local{
		void disp() {
			int a =10; // variable created inside a method so Local
			double b = 20.5;
			System.out.println(a);
		}
	}
	


	
	
	
	
	
