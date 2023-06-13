package javaPackage;

public class Nestedifelse {

	//Nested if statement
	//1.It represents the if block within another if block
	//2.Concept run on the basis of inner and outer if block
	//3.The inner if block will execute only when outer if block will true
	
	public static void main(String[] args) {
		
		int age=25;
		int weight=50;
		
		//Outer if block
		if(age>18) {
			
			if(weight==50) {
				System.out.println("Eligible for blood donation");
			}
			else {
				System.out.println("Not Eligible for blood donation");
			}
		}
		else {
			System.out.println("Age must greater then 18");
		}
	}
}
