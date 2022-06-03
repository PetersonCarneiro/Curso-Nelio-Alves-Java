package entities;

public class Campany extends TaxPayer {
	 
	private int numberOfEmployees;

	public Campany() {
		super();
	}

	public Campany(String name, Double anuallncome, int numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	@Override
	public Double tax() {
		if(numberOfEmployees<10) {
			return getAnuallncome()*16/100;
		}else {
			return getAnuallncome()*14/100;
		}
	}

	
}
