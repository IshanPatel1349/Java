
//Superclass 
class Base {

	// Static method in base class which will be hidden in subclass
	public static void display() {
		System.out.println("10");
	}

	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("100");
	}
}

//Subclass 

class Derived extends Base {

	// This method hides display() in Base

	/*
	 * public void display() { System.out.println("20"); }
	 */

	// This method overrides print() in Base
	public void print() {
		System.out.println("200");
	}
}

//Driver class 
public class Test2 {
	public static void main(String args[]) {
		Base obj1 = new Derived();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		obj1.display();

		// Here overriding works and Derive's print() is called
		obj1.print();
	}
}