package observerpattern;

public interface Observer {
	
	public void update(String eventName,String eventLocation,int noOfTicketsBooked);

}
