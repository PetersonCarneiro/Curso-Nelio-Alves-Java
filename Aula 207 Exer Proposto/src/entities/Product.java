package entities;

public class Product {
	
	private String name;
	private Double price;
	private int unit;
	
	public Product(String name, Double price, int unit) {
		super();
		this.name = name;
		this.price = price;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public double total() {
		return price * unit;
	}

}
