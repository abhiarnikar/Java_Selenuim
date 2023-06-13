package javaPackage;

public class Array {

	public static void main(String[] args) {
		
		String[] cities= {"Pune","Mumbai","Satara","Nashik"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		// When we retrieve the value from out of index range it gives error
		System.out.println(cities[9]); // java.lang.ArrayIndexOutOfBoundsException:
		
	}
}
