package strategy;

public class ShoppingCart {

	private PaymentStrategy paymentStrategy;

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	
	public void checkout(int amount) {
		if(paymentStrategy==null) {
			System.out.println("Please select the payment mode");
		}else {
			paymentStrategy.pay(amount);
		}
	}
}