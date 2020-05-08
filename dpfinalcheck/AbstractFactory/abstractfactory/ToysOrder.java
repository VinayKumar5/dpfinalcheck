package abstractfactory;

public class ToysOrder extends Order{

	@Override
	public void processOrder() {

		System.out.println("Toys Order:"+" Channel:"+channel+" Product Type:"+productType+"\n");
		
	}

}
