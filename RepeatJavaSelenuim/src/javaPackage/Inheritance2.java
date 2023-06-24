package javaPackage;

public class Inheritance2 extends Inheritance1 {

	String name="Abhijit";
	
	public static void main(String[] args) {
		
		Inheritance2 In2=new Inheritance2();
		
		System.out.println(In2.name);
		
		System.out.println(In2.rollNo); // Here we Access the variable from Inheritance1 class
		
	}
}
