package abstractfactory;

public abstract class Order {
	
	
	String channel;
	String productType;
	
	public abstract void processOrder();
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}	

}
