package list;

public class ElectricProduct extends Product {
	private int voltage;
	
	public ElectricProduct() {
		//supposed to do nothing.
	}
	
	public ElectricProduct(long id, String name, double price, String manufacturer, int voltage) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setManufacturer(manufacturer);
		this.setVoltage(voltage);
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	@Override
	public String toString() {
		return "ElectricProduct, " + getId() + ", " + getName() + ", " + getPrice() + ", " + 
		getManufacturer() + ", " + getVoltage();
	}
	
	

}
