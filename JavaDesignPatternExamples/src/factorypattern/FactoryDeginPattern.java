package factorypattern;

public class FactoryDeginPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment payment = FactoryPayment.getPayment("netbanking");
		
		payment.processPaymeent(5000);
	}

}