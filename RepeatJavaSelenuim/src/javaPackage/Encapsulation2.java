package javaPackage;

public class Encapsulation2 {

	public static void main(String[] args) {
		
		Encapsulation1 E1 = new Encapsulation1();
		
		E1.setName("Abhijit");
		
		System.out.println(E1.getName());
		
		E1.setAccountNumber(750785);
		
		System.out.println(E1.getAccountNumber());
	}
}
