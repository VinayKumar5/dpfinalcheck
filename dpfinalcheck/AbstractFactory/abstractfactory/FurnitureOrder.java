package abstractfactory;

public class FurnitureOrder extends Order{

	@Override
	public void processOrder() {
		
		System.out.println("Furniture Order:"+" Channel:"+channel+" Product Type:"+productType+"\n");
		
	}
	
	

}
