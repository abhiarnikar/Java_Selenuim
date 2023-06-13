package javaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		
		int i=1;
		int a=20;
		int b=25;
		
		System.out.println(i++);//1
		System.out.println(i);//2
		
		System.out.println(a++ + a--);//20,21 20+21=41
		System.out.println(--b + ++b);//24,24+1=25 24+25=49
		System.out.println(--b + --b);//24,23 24+23=47
		System.out.println(++b + b--);//24,24 24+24=48
		System.out.println(b);//23
	}
}
