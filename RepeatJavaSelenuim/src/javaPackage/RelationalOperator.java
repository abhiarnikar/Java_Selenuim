package javaPackage;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int a = 200;
		int b = 300;
		
		String P="Selenuim Class";
		String Q="Selenuim class";
		
		//1st way of Comparision
		if(P==Q) {
			System.out.println("P is equal to Q");
		}
		
		else {
			System.out.println("P is not equal to Q");
		}
		
		//2nd way of Comparision
		if(P.equals(Q)) {
			System.out.println("P is equal to Q in 2nd way");
		}
		else {
			System.out.println("P is not equal to Q in 2nd way");
		}
		
		//3rd way of comparision
		if(P.equalsIgnoreCase(Q)) { // This will ignore upper and lower case letter
			System.out.println("P is equal to Q in 3rd way");
		}
		
		else {
			System.out.println("P is not equal to Q in 3rd way");
		}
	}
}
