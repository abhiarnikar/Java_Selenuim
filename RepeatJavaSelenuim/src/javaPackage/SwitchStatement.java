package javaPackage;

public class SwitchStatement {

	public static void main(String[] args) {
		
		//Switch statement
		
		int number = 25;
		
		switch(number) {
		
		case 10:
			System.out.println("Not matched it is 10");
			break;
			
		case 15:
			System.out.println("Not matched it is 15");
			break;
			
		case 25:
			System.out.println("matched it is 25");
			break;
			
		case 35:
			System.out.println("Not matched it is 35");
			break;
			
		default:
			System.out.println("No case value matched with expression");
		}
	}
}
