package javaPackage;

public class InheritanceC extends InheritanceB {

	public static void main(String[] args) {
		
		// This is multileval Inheritance Concepts so we can Access methods from
		// InheritanceB and also from InheritanceC
		
		InheritanceC IC=new InheritanceC();
		
		IC.read();//Here we Access the method from InheritanceB class
		IC.write();//Here we Access the method from InheritanceA class
		
	}
	
}
