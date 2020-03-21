package week1.day1;

public class Car {
	
	// Methods: soundHorn, driveCar, applyBrake, isPuncture
	
	// Design a method
	// Syntax: 
	// access_modifier return_type method_name (input argument)
	// access_modifier
	// public, package (deafult), private, protected
	// public -> anyone can access 
	// private -> only you (the class) can access
	// package -> people living same build (apartment) can access
	// protected -> inherited + package 
	

	// return_type
	// Data Type : Primitive / Non-Primitive (Class) -> String, Array
	
	boolean hadLunch = false;
	String name = "Babu";
	String phoneColor = "black";
	char myFirstLetter = 'B';
	
	
	public static void main(String[] args) {
		
		System.out.println("I am ready");		
		
		// shortcut
		// syso -> ctrl+space (+ enter)
		
	}
	
	// access_modifier return_type method_name (input argument)
	public int add(int a, int b) {
		return a+b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	// method to driveCar
	public void driveCar(String which) {
		System.out.println("I am driving "+which);
	}
	
	
	
	
	
	

}
