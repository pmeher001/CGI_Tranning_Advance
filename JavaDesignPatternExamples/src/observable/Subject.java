package observable;

public interface Subject {

	void registerObservable(Observable o);
	void removeObservable(Observable o);
	void notifyObervable();
}