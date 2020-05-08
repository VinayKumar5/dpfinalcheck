package observerpattern;

public class Main {
	
	public static void main(String[] args) {
		Admin adminTeam1=new Admin(); // observer
		Admin adminTeam2 =new Admin();
		
		NotificationService service=new NotificationService();
		service.registerObserver(adminTeam1);
		service.registerObserver(adminTeam2);
		
		service.createNotification("AI","DDun",150);
		
		service.unregisterObserver(adminTeam1);
		
		service.createNotification("ML","UK",90);		
		
	}

}
