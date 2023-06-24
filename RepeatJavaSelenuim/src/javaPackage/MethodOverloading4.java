package javaPackage;

public class MethodOverloading4 extends MethodOverloading3{

	public static void main(String[] args) {
		
		//Here we create Object from class MethodOverloading4 to Access method from class MethodOverloading3
		MethodOverloading4 mo4=new MethodOverloading4();
		
		System.out.println(mo4.add(10, 10));//20
		System.out.println(mo4.add(10, 10, 10));//30
		
		//Now we can Access those method without creating Object from class
		//We can Access those method by class name
		
		System.out.println(MethodOverloading3.add(12, 13));//25
		System.out.println(MethodOverloading3.add(12, 13, 14));//39
	}
}
