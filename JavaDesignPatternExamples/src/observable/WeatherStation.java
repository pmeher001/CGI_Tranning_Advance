package observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

	List<Observable> observable=new ArrayList<Observable>();
	private int tempature;
	
	public List<Observable> getObservable() {
		return observable;
	}
	public void setObservable(List<Observable> observable) {
		this.observable = observable;
	}
	public int getTempature() {
		return tempature;
	}
	public void setTempature(int tempature) {
		this.tempature = tempature;
	}
	@Override
	public void notifyObervable() {
		for(Observable obj:observable) {
			//System.out.println(obj);
			obj.update(tempature);
		}
		
	}@Override
	public void registerObservable(Observable o) {
		observable.add(o);
		
	}@Override
	public void removeObservable(Observable o) {
		observable.remove(0);
		
	}
}