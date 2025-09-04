package factorypattern;

public class FactoryPayment {

	
	public static Payment getPayment(String type) {
		
		Payment payment=null;
		switch (type) {
		case "upi":payment =new UpiPayment();
			
			break;
		case "credit":payment =new CredictCard();
		
		break;
		case "debit":payment =new DebitCard();
		
		break;
		default:payment=null;
			break;
		}
		return payment;
	}

}