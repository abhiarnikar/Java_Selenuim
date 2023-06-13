package javaPackage;

public class Variable2 {

	int abhi =100;//global variable
	
	int kaivaly =200; //global variable
	
	static String name="Abhijit Arnikar";
	
	public static void main(String[] args) {
		
		int aa = 500; //local variable
		
		System.out.println(aa);
		
		//when we want access global variable into main method then we
		// have to create object from class
		
		Variable2 greet= new Variable2();
		
		System.out.println(greet.abhi);
		
		System.out.println(greet.kaivaly);
		
		// we can variable from user defined method with the help of object
		
		greet.a();
		greet.b();
		
		// We can Access static variable directly by the class name
		
		System.out.println(Variable2.name);// Abhijit Arnikar
		
	}
	
	//user defined method
	
	public void a() {
		int z = 451;//local variable
		
		System.out.println(z);
	}
	
	//user defined method
	
		public void b() {
			int g = 362;//local variable
			
			System.out.println(g);
		}
	
	
}
