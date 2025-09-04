package factorypattern;

public class UpiPayment implements Payment{
	@Override
	public void processPaymeent(double amount) {
		System.out.println("payment proccessed using UPI "+amount);
		
	}
}