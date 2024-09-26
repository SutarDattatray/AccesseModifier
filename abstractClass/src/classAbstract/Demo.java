   
package classAbstract;

public abstract class Demo {
	/*
	 * Condition :The parent class has to provide the implementation of few methods,
	 * and has to keep the other methods open for the implementation in the child
	 * class.
	 */
	// Abstract class :- are partially abstract
	// abstract class have both abstract and non-abstract method
	// abstract method doesn't have any method body only signature ..
	// Abstract method can be override in another class.
	// Class having at least one abstract method must be specified as abstract class..
	// We can declare method inside the abstract class as public and protected.
	// We can't declare method as private in abstract class and can't override in another class.
	// We can't create object of abstract class in child class. 
	// Only Abstract method can be override in child class by extending parent class.
	// Constructor can not be created in abstract class.

	
	// 1)Non Abstract method
	public void methodx() {
		System.out.println("method x");

	}

	// 2)Abstract method
	public abstract void methody();
	
	
	// 3)Abstract method
	protected abstract void methodz();
	
	

}
