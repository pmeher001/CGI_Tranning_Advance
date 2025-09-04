package observable;

public class PhoneApp implements Observable{
	
	@Override
	public void update(float temperate) {
		System.out.println("Phone App recevive temperate details as "+temperate);
		
	}
}