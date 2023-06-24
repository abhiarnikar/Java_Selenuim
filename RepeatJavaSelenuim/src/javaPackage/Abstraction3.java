package javaPackage;

public class Abstraction3 extends Abstraction2{

	@Override
	public void createNewAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		
	}
	
    public static void main(String[] args) {
		
		//Abstraction2 ab2=new Abstraction2();//we cannot create Object of abstract class
    	
    	Abstraction2 ab2=new Abstraction3();
    	
    	ab2.createNewAccount();
    	ab2.Withdraw();
	}

	
}
