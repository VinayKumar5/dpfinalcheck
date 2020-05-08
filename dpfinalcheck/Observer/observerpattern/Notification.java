package observerpattern;

public interface Notification {
	
	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
	public void notifyObservers();
}
