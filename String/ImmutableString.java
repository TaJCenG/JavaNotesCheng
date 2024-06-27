package String;

public class ImmutableString {
	public static void main(String [] args) {
	/*
	 * when ever java program has to execute it will come on the RAM
	 * In RAM one region will be there on the region we call it as JRE.
	 * 
	 * Where JVM allocate data areas like method area, heap, stack, when ever object terms come into picture
	 * memory allocate in heap area, since string treated as object so it will use heap area.
	 * 
	 * Generally we have normal heap area in that we have string constant pool or string pool
	 * Specialty of scp is duplicates are not promoted.
	 * Specialty of heap area is duplicates allowed.
	 * 
	 * Without using new keyword memory allocate in SCP(String constant pool)
	 * IF we create using new keyword memory allocate in main heap area.
	 * 
	 */

	String a = "Taj";
	String b = new String("Taj");
	// difference is a is using SCP
	//b is using heap area to save memory
	
	
	String c = "Taj";
	String d= "Taj";
	//The difference is for both memory will be in SCP 
	//but it will not create on more object in SCP it refers to C only
	
	String e = new String("Taj");
	String f = new String("Taj");
	// memory allocated in main heap area and 2 new objects will be created
	// duplicated are allowed by using new keyword
	
//----------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	String a1 = "Taj";
	String b1 = "Taj";
	String c1 = new String("Taj");
	System.out.println(a1==b1);  //True
	System.out.println(a1==c1);  //False
	System.out.println(a1.equals(c1)); //true	
	//here a1 a2 are same and c1 is different 
	//because c1 is using new keyword and allocating new memory heap area.
	//a1.equalsc1 is comparing actual values so it is true
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	String d1 = new String("Taj");
	String e1 = new String("Taj");
	System.out.println(d1==e1); //false
	//Address is different
	//internally JVm make a copy in SCP which implicit but its not considered
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	String g = "Taj";
	String h = "taj";
	String i = new String("Taj");
	System.out.println(g==h);//false
	System.out.println(g==i);//false
	System.out.println(g.equals(i));//true
	System.out.println(g.equalsIgnoreCase(i));//true
	//It ignores casesensitivity of values & both are SCP
	//if doesnt ignore then stores in SCP as diff object
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	
	String j = "Taj";
	String k = "Taj";
	String m = "taj";
	String l = new String("Taj");
	System.out.println(j.compareTo(k));
	System.out.println(j.compareTo(l));
	System.out.println(j.compareTo(m));
	//if it returns zero 0 values are same
	
	int res = j.compareTo(k);
	int resu = j.compareTo(l);
	int re = j.compareTo(m);
	if (res ==0 && resu ==0 ) {
		System.out.println("String are equal");
	}
	if (re!=0) {
		System.out.println("String are not equal");
	}else
		System.out.println("");

	
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	
	
	String n = "Taj";
	String o = "Cheng";
	System.out.println(n.concat(o));
	System.out.println(n+o);
	
	// we can do concat with both 
	//concat  and + operator
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}	
	
