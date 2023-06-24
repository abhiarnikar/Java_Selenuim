package javaPackage;

public abstract class Abstraction2 extends Abstraction1{

	@Override
	public abstract void createNewAccount(); 

	@Override
	public abstract void Withdraw();

	public static void main(String[] args) {
		
		//Abstraction2 ab2=new Abstraction2();//we cannot create Object of abstract class
	}
	
}
