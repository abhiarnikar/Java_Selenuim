package javaPackage;

public class MethodOverriding6 {

	static void m1() {
		System.out.println("A-M1");
	}
	
	void m2() {
		System.out.println("A-M2");
	}
	
	static void m3() {
		System.out.println("A-m3,No Parameter");
	}
	
	int m3(String s) {
		System.out.println("A-m3,String Parameter");
		return 50;
	}
}
