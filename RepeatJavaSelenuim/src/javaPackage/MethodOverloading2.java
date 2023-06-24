package javaPackage;

public class MethodOverloading2 extends MethodOverloading1{

	public static void main(String[] args) {
		
		MethodOverloading2 mo2=new MethodOverloading2();
		
		mo2.sum(12, 36);//Here we Access method from MethodOverloading1 which have 2 Parameters Output is 48
		
		mo2.sum(11, 24, -14);//Here we Access method from MethodOverloading1 which have 3 Parameters Output is 21
	}
}
