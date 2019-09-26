package list;

public class FoodProduct extends Product {
	private boolean isVegan;
	
	public FoodProduct() {
		//isn't supposed to do anything.
	}
	
	public FoodProduct(long id, String name, double price, String manufacturer, boolean isVegan) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setManufacturer(manufacturer);
		this.setIsVegan(isVegan);
	}
	
	public boolean getIsVegan() {
		return isVegan;
	}
	
	public void setIsVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
	
	@Override
	public String toString() {
		return "FoodProduct, " + getId() + ", " + getName() + ", " + getPrice() + ", " + 
		getManufacturer() + ", " + getIsVegan();
	}
	

}
