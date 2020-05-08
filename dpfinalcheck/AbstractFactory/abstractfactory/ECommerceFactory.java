package abstractfactory;

public class ECommerceFactory extends AbstractFactory {

	@Override
	Order getOrder(String orderType) {
		Order order=null;
		
		if(orderType.equalsIgnoreCase("ElectronicOrder"))
		{			
			order=new ElectronicOrder();
			
			order.setProductType("Electronic");
			
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
		
		order.setChannel("ECommerce");
		return order;
	}

}
