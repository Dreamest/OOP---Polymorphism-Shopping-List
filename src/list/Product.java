package list;

public class Product {
	private long id;
	private String name;
	private double price;
	private String manufacturer;

	public Product() {
	}

	public Product(long id, String name, double price, String manufacturer) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "" + id + "," + name + "," + price + "," + manufacturer;
	}

}
