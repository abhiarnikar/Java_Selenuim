package javaPackage;

public class UnaryOperator1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		System.out.println(a++); // 10
		System.out.println(a);//11
		
		System.out.println(a++ + ++a);//11,12+1=13  11+13=24
		
		System.out.println(a);//13
		
		System.out.println(b++ + --b); //10,11-1=10  10+10=20
		
		System.out.println(b++ + b--);//10,11 10+11=21
	}
}
