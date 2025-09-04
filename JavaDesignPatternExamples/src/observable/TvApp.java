package observable;

public class TvApp implements Observable{
	
	@Override
	public void update(float temperate) {
		System.out.println("TV App recevive temperate details as "+temperate);
		
	}
}