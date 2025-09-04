package abstractkeyword;

abstract class Bike {
	int wheel;
	Bike() {
		this.wheel=4;
	}
	abstract void speed();
	void displayColourDetails(String colour) {
		System.out.println("Colour is "+colour);
	}
}
abstract class Honda extends Bike {
	void mailage() {
		System.out.println("Honda mailage : 70km/lt");
	}
}
class Activa extends Honda {
	@Override
	void speed() {
		System.out.println("Honda Speed : 50km/hr");
	}
}
class Pulsar extends Bike {
	void mailage() {
		System.out.println("Pulsar mailage : 40km/lt");
	}
	@Override
	void speed() {
		System.out.println("Pulsar Speed : 90km/hr");
	}
}
class Tvs extends Bike {
	void mailage() {
		System.out.println("Tvs mailage : 40km/lt");
	}
	@Override
	void speed() {
		System.out.println("TVS Speed : 50km/hr");	
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		Activa ac = new Activa();
		ac.displayColourDetails("Black");
		ac.speed();
		ac.mailage();
	}

}