package javaPackage;

public class Variable1 {
	
	int a = 200; //Global variable
	
	String name="Abhijit Arnikar"; //Global variable
	
	//static String fname="Devyani";//static global variable

	// short cut for main method type ma press ctrl+space button and then click on Enter Key
	public static void main(String[] args) {
		
		int data =50; //Local variable int is Data type and data is Variable name ,50 is variable value
		
		// static String java ="Automation Training"; // we cannot declared local variable as a static
		
		int x=100;
		
		System.out.println(x);
		
		x=500; // Here value of x is updated to 500
		
		System.out.println(x);
		
		Variable1 abhi=new Variable1(); // Creating object from class
		
		System.out.println(abhi.a);
		
		System.out.println(abhi.name);
		
		char a='K'; //char is always placed inside the single quote
		
		String city="Pune";//String is always placed inside the double quote
	}
}
