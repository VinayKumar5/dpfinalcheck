package abstractfactory;

public class ElectronicOrder extends Order {

	
	@Override
	public void processOrder() {
		
		System.out.println("Electronic Order:"+" Channel:"+channel+" Product Type:"+productType+"\n");	
		
	}
	
	

}
