package day01.solved;

public class MyClassInstance {
	// Declare an instance variable
	public int instanceVariable;

	public static void main(String[] args) {
		// Create an object of MyClass
		MyClassInstance myObject = new MyClassInstance();

		// Access the instance variable using the object reference
		myObject.instanceVariable = 5;
		System.out.println(myObject.instanceVariable);
	}
}
