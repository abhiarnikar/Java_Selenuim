package javaPackage;

public class InheritanceB extends InheritanceA {

	public void read() {
		System.out.println("I am Reading");
	}
	
	public static void main(String[] args) {
		
		InheritanceB IB=new InheritanceB();
		
		IB.write();//Here we Access the method from InheritanceA class
		IB.read();
	}
}
