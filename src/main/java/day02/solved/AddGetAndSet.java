package day02.solved;

public class AddGetAndSet {
public static void main(String[] args) {
        
        //create Account
		BankAccount acct1 = new BankAccount();
        acct1.setAccNo("A101");
        acct1.setName( "Krishna" );
        acct1.setBalance(1000);
 
        System.out.println(acct1.getAccNo());
        System.out.println(acct1.getName());
        System.out.println(acct1.getBalance());
        
        ShapeCalculator calculator = new ShapeCalculator();
        double circleArea = calculator.calculateArea(3.5);  
        System.out.println(circleArea);
        // Output: 38.48451000647496
        double rectangleArea = calculator.calculateArea(4.2, 6.8);  
        System.out.println(rectangleArea);
        // Output: 28.559999999999995
    }
}
