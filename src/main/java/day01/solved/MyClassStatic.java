package day01.solved;

public class MyClassStatic {
	// Declare a static variable
    public static int staticVariable;

    public static void main(String[] args) {
        // Access the static variable using the class name
        MyClassStatic.staticVariable = 10;
        System.out.println(MyClassStatic.staticVariable);
    }
}
