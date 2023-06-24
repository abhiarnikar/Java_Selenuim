package javaPackage;

public class HDFCclass implements Interface1{

	@Override
	public void makeOneTimePayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enrollPayment() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		//Here we cannot create object of Interface1
		//so we need to give referance of child to create object
		
		Interface1 It=new HDFCclass();
		
		It.makeOneTimePayment();
		It.creditCard();
		It.enrollPayment();
	}
}
