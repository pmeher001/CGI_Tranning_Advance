package observable;

public class MainApp {

	public static void main(String[] args) {
		WeatherStation ws = new WeatherStation();
		
		Observable phone = new PhoneApp();
		Observable tv = new TvApp();
		
		ws.registerObservable(phone);
		ws.registerObservable(tv);
		
		System.out.println("Set the temperature");
		ws.setTempature(25);
		
		ws.notifyObervable();	// publish the new temperature 2 device notify 
		
		ws.removeObservable(phone);		
		
		System.out.println("Set the temperature");
		ws.setTempature(21);
		
		ws.notifyObervable();	// publish the new temperature 1 device notify 

	}

}