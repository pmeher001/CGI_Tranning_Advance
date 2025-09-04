package factorypattern;

public class CredictCard implements Payment{
	@Override
	public void processPaymeent(double amount) {
		System.out.println("payment proccessed using Credit Card "+amount);
		
	}
}