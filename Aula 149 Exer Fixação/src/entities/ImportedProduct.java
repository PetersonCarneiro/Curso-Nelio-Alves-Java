package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;



	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	
	public Double totalPrice() {
		return super.getPrice() + getCustomsFee() ;
	}
	
	@Override
	public String priceTag() {
		return  getName()
				+" $"
				+String.format("%.2f",totalPrice())
				+"(Customs fee: $"
				+String.format("%.2f",customsFee)
				+")";
	}
}
