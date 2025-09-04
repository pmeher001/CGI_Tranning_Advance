package factorypattern;

public class DebitCard implements Payment{
	@Override
	public void processPaymeent(double amount) {
		System.out.println("payment proccessed using Debit card  "+amount);
		
	}
}