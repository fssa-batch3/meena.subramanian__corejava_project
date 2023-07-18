package day05.practice;

public class App {
	public static void main(String[] args) {
		Account myAcc = new Account("5000", 10000);

		// IciciAtm
		System.out.println("ICICI Bank");
		IciciATM iciciAcc = new IciciATM();

		iciciAcc.deposit(myAcc, 1000.0);

		try {
			iciciAcc.withdraw(myAcc, 2000.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(myAcc.getAccNo());
		System.out.println(myAcc.getBalance());

		// AxisAtm
		System.out.println("Axis Bank");
		AxisATM axisAcc = new AxisATM();

		axisAcc.deposit(myAcc, 1000.0);

		try {
			axisAcc.withdraw(myAcc, 2000.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(myAcc.getAccNo());
		System.out.println(myAcc.getBalance());

	}
}