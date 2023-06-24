package javaPackage;

public class ChildClass implements FatherInterface,MotherInterface{

	@Override
	public void height() {
		
		float ht=(FatherInterface.HT+MotherInterface.HT)/2;//Here we directly Access variable from FatherInterface and MotherInterface
		// Because variables in Interface are by default static.
		
		System.out.println("Child Height:"+ht);
		
	}

	public static void main(String[] args) {
		
		//Here the concept of Multiple Inheritance is Done with the help of Interface
		
		ChildClass ch=new ChildClass();
		
		ch.height();
	}
	
}
