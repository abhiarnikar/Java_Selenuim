package samePackage;

public class B {

	public static void main(String[] args) {
		
		A a=new A();
		
		//System.out.println(a.a); it is private Access Modifier so not Access in Another class
		
		System.out.println(a.b); //public
		
		System.out.println(a.c);//protected
		
		System.out.println(a.d);//default
	}
}
