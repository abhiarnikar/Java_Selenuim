package javaPackage;

public class MethodOverriding5 {

	public static void main(String[] args) {
		
		//Here we use Dynamic method Dispatch
		
		MethodOverriding3 mo3=new MethodOverriding4();
		
		mo3.cook();//child class method will get execute
		
		mo3.eat();//Parent class method will get execute
		
		//mo3.play() //This method we cannot Access in Dynamic method Dispatch because this method is not Present in parent class
		// it only present in child class so to Access this we need to create object from child class
		
		MethodOverriding4 mo4=new MethodOverriding4();
		
		mo4.play();
		
		
	}
}
