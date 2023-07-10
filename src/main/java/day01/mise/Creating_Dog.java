package day01.mise;

public class Creating_Dog {

	
	// Attributes
    private boolean hasDots;
    private String color;
    // Constructor
    public Creating_Dog(boolean hasDots, String color) {
        this.hasDots = hasDots;
        this.color = color;
    }
   
	// Getters and setters
    public boolean hasDots() {
        return hasDots;
    }
    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
		public void speak() {
        System.out.println("Woof!");
    }
	
	
	
	
	
	public static void main(String[] args) {

		
		// Create two Dog objects
		Creating_Dog dog1 = new Creating_Dog(true, "purple");
		Creating_Dog dog2 = new Creating_Dog(true, "blue");
        // Print the attributes of each Dog
        System.out.println("Dog 1:");
        System.out.println("Has Dots: " + dog1.hasDots());
        System.out.println("Color: " + dog1.getColor());
        dog1.speak();
        System.out.println("Dog 2:");
        System.out.println("Has Dots: " + dog2.hasDots());
        System.out.println("Color: " + dog2.getColor());
        dog2.speak();
	}
}