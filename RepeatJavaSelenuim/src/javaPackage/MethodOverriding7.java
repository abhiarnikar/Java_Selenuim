package javaPackage;

public class MethodOverriding7 extends MethodOverriding6{


	static void m1() {
		System.out.println("B-M1");
	}
	
	void m2() {
		System.out.println("B-M2");
	}
	
	void m3(float f,int a) {
		System.out.println("B-M3,float and int Parameter");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding7 mo7=new MethodOverriding7();
		
		mo7.m1();
		mo7.m2();
		mo7.m3();//A-m3,No Parameter
		mo7.m3("Abhijit");//A-m3,String Parameter
		mo7.m3(6.3f, 45);
		
		MethodOverriding6 mo6=new MethodOverriding7(); //Dynamic Method Dispatch
		
		
		mo6.m2();//B-M2 Here this m2 method present in both child and Parent class but because of Dynamic method Dispatch
		// Child class method will get execute
		mo6.m3("Abhi");//A-m3,String Parameter
		
		mo6.m1();//Here this m1 method present in both child and Parent class and both having static keyword 
		//Because of static keyword Parent class method will get execute
		
		
		
		
	}
}
