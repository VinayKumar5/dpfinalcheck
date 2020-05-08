package abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String channel)
	{
		AbstractFactory factory=null;
		
		if(channel.equalsIgnoreCase("ECommerce"))
			factory=new ECommerceFactory();
		else if(channel.equalsIgnoreCase("TeleCaller"))
			factory=new TeleCallerFactory();
		
		return factory;
	}
}
