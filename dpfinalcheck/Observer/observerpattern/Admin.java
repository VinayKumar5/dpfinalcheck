package observerpattern;

public class Admin implements Observer{
	
	private String eventName;
	private String eventLocation;
	private int noOfTicketsBooked;

	@Override
	public void update(String eventName, String eventLocation,int noOfTicketsBooked) {
		
		this.eventName=eventName;
		this.eventLocation=eventLocation;
		this.noOfTicketsBooked=noOfTicketsBooked;
		display();				
	}
	
	public void display()
	{
		System.out.println("New Event details:\n"+" Event Name:"+eventName+"\nEvent Location:"+eventLocation);
		System.out.println("No of Tickets Booked:"+noOfTicketsBooked);
	}

}
