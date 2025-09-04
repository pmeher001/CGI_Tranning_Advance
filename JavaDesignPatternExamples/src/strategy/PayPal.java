package strategy;

public class PayPal implements PaymentStrategy{
private String emailid;

	
	public PayPal(String emailid) {
	super();
	this.emailid = emailid;
}


	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Your payment processed successfully with paypal with emailid  as "+emailid+" with amount as "+amount);	
	}
	}