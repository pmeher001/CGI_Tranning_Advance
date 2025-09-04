package strategy;

public class Gpay implements PaymentStrategy{
private String phonenumber;

	public Gpay(String phonenumber) {
	super();
	this.phonenumber = phonenumber;
}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Your payment processed successfully with Gpay with number as "+phonenumber+" with amount as "+amount);
	}
}