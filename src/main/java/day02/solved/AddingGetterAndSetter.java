package day02.solved;

public class AddingGetterAndSetter {
	private static String name;  // Private data member

    public String getName() {  // Public getter method
        return name;
    }

    public void setName(String newName) {  // Public setter method
        name = newName;
    }
    
    public static void main(String[] args) {
// Usage
AddingGetterAndSetter person = new AddingGetterAndSetter();
person.setName("John");      // Setting the name using the setter method
String name = person.getName();  // Accessing the name using the getter method
System.out.println(name);    // Output: John

}
}
