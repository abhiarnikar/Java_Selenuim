package javaPackage;

public class Ifelse1 {

	public static void main(String[] args) {
		
		int a = 10;
		
		// if-else statement
		if(a/10==1) {
			System.out.println("Result of a is equal to 1");
		}
		else {
			System.out.println("Result of a is not equal to 1");
		}
		
		// if-else-if ladder statement
		
		int p=400;
		int q=300;
		
		if(p>q) {
			System.out.println("p is greater than q");
		}
		else if(q>p) {
			System.out.println("q is greater than p");
		}
		else {
			System.out.println("q is equal to p");
		}
		
		int x = 100;
		int y = 200;
				
		if(x>y) {
			System.out.println("x is greater than y");
		}
		else if(y>x) {
			System.out.println("y is greater than x");
		}
		else {
			System.out.println("x is equal to y");
		}
		
		int j = 100;
		int k = 100;
		
		if(j==k) { // In this condition if block is true so controller will not check other blocks so only one statement is printed
			System.out.println("j is equal to k");
		}
		else if(k==j) {
			System.out.println("k is equal to j");
		}
		else {
			System.out.println("j is greater then k");
		}
		
				
	}
}
