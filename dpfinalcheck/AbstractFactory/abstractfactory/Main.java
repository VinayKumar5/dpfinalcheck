package abstractfactory;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractFactory ecomFactory1=FactoryProducer.getFactory("Ecommerce");
		Order order1=ecomFactory1.getOrder("ElectronicOrder");
		order1.processOrder();
		
		AbstractFactory ecomFactory2=FactoryProducer.getFactory("Ecommerce");
		Order order2=ecomFactory2.getOrder("ToysOrder");
		order2.processOrder();
		
		AbstractFactory teleCaller=FactoryProducer.getFactory("TeleCaller");
		Order order3=teleCaller.getOrder("FurnitureOrder");
		order3.processOrder();
		
		
	}

}
