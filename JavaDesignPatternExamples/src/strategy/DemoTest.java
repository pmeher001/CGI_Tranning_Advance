package strategy;

public class DemoTest {

	public static void main(String[] args) {
		
		ShoppingCart sc  = new ShoppingCart();
		
		

		sc.checkout(10000);
		
		sc.setPaymentStrategy(new CreditCartPayment("1234-3456-6787-4546"));
		
		sc.checkout(5000);
		
		sc.setPaymentStrategy(new Gpay("57587647587"));

		sc.checkout(1200);
	
		sc.setPaymentStrategy(new PayPal("ravi@gmail.com"));
	
		sc.checkout(500);
		
		
	}
	

}