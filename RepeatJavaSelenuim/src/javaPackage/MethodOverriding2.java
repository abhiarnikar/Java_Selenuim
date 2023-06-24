package javaPackage;

public class MethodOverriding2 extends MethodOverriding1 {

	public void eat() {
		System.out.println("You are eating");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding2 mo2=new MethodOverriding2();
		
		mo2.eat();//Here method from child class i.e from MethodOverriding2 is executed in MethodOverriding(You are eating)
		
		
		//If we want to Access method from parent class i.e from MethodOverriding1 then we need to create object from that class
		
		MethodOverriding1 mo1=new MethodOverriding1();
		
		mo1.eat();//I am eating
	}
}
