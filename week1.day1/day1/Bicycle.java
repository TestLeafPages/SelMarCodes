package week1.day1;

public class Bicycle {
	
	// 2 Methods, 2 Variables
	// rideCycle, ringBell
	// brand, tyreWidth
	
	String brand = "Hero";
	int tyreWidth = 6;
	
	public void rideCycle() {
		System.out.println("I am riding cycle");
	}
	
	public boolean ringBell() {
		return true;
	}
	
	// How to call these methods
	public static void main(String[] args) {
		
		// Step 1: Create a reference for the class
		// Syntax: ClassName obj = new ClassName();
		Bicycle cycle = new Bicycle();		
		
		// Step 2: Call the method using reference
		// Syntax: obj.methodName();
		cycle.rideCycle();
		
		// Ctrl + F11
		
		boolean ringBell = cycle.ringBell();
		
		// ctrl+2 (press, release)+ l
		System.out.println(ringBell);
		
		// Print the variable
		String brand2 = cycle.brand;
		System.out.println(brand2);
		
		int tyreWidth2 = cycle.tyreWidth;
		
	}
	

}
