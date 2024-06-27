package OOPS.MethodOverloading;

import java.util.Scanner;

public class bScannerClass {

	public static void main(String[] args) {
	
		
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : " );
        name = sc.nextLine();
        System.out.println("Enter your age: " );
        age = sc.nextInt();
        System.out.println("your Name : " + name);
        System.out.println("your age : " + age);    
	}

}
