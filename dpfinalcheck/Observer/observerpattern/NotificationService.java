package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Notification {

	private String eventName;
	private String eventLocation;
	private int noOfTicketsBooked;
	private List<Observer> list = null;

	public NotificationService() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {

		list.add(observer);

	}

	@Override
	public void unregisterObserver(Observer observer) {
		list.remove(observer);

	}

	@Override
	public void notifyObservers() {

		for (Observer o : list) {
			o.update(eventName, eventLocation,noOfTicketsBooked);
		}

	}
	
	public void createNotification(String eventName,String eventLocation, int noOfTicketsBooked)
	{	
		setEventName(eventName);
		setEventLocation(eventLocation);
		setNoOfTicketsBooked(noOfTicketsBooked);
		
		if(noOfTicketsBooked>100)
		{
			notifyObservers();
		}		
		
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public int getNoOfTicketsBooked() {
		return noOfTicketsBooked;
	}

	public void setNoOfTicketsBooked(int noOfTicketsBooked) {
		this.noOfTicketsBooked = noOfTicketsBooked;
	}

}
