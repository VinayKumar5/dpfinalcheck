package abstractfactory;

public class TeleCallerFactory extends AbstractFactory {

	@Override
	Order getOrder(String orderType) {
		Order order=null;
		
		if(orderType.equalsIgnoreCase("ElectronicOrder"))
		{
			order=new ElectronicOrder();
			order.setProductType("Electronics");
		}
			
		else if(orderType.equalsIgnoreCase("FurnitureOrder"))
		{
			order=new FurnitureOrder();
			order.setProductType("Furniture");
		}
			
		else if(orderType.equalsIgnoreCase("ToysOrder"))
		{
			order=new ToysOrder();
			order.setProductType("Toys");
		}
			
		order.setChannel("TeleCaller");
		return order;
		
	}

}
