package javaPackage;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		System.out.println(a<b && a<c);//false && true output should be false
		//Because controller will not check second condition if first condition is false in &&
		
		System.out.println(a<b & a<c); //false & true output should be false
		
		System.out.println(a<b && a++<c); // This is in Logical Operator
		
		System.out.println(a);// Here value of a is 10 Because in above statement first condition is false 
		// so controller will not check second condition so value of a is not increamented
		
		//Bitwise Operator
		
		System.out.println(a<b & a++<c); //false  In this Bitwise Operator controller will check both condition wheather first condition is true or false
		
		//so false & value of a is 10<20 is true but at the backend value of a is increamented by 1 ie 11
		
		System.out.println(a);//11
		
	}
}
