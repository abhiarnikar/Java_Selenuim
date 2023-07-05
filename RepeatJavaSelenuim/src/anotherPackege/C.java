package anotherPackege;

import samePackage.A;

public class C extends A{

	public static void main(String[] args) {
		
		A a=new A();
		
		//System.out.println(a.a); private
		System.out.println(a.b); //public
		//System.out.println(a.c); //protected
		//System.out.println(a.d);default
		
		C c=new C();
		
		System.out.println(c.c); //Here we Access protected variabel from class A with the help of Inheritance
		
		System.out.println(c.b);//Here we can Access public variable
		
		//System.out.println(c.a);//private not Access
		
		//System.out.println(c.d);//default not Access
	}
}
