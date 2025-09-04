package strategy;

public class CreditCartPayment implements PaymentStrategy{
private String cardNumber;

	
	
	public CreditCartPayment(String cardNumber) {
	super();
	this.cardNumber = cardNumber;
}



	@Override
	public void pay(double amount) {
	// TODO Auto-generated method stub
		System.out.println("Your payment processed successfully with card number as "+cardNumber+" with amount as "+amount);
	}
}