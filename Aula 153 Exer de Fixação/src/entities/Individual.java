package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
				if(getAnuallncome()<20000.00) {
					return getAnuallncome()*15/100;
				}else if(getAnuallncome()>=20000.00 && healthExpenditures>0){
					return getAnuallncome()*25/100-healthExpenditures *50/100;
				}else {
					return getAnuallncome()*25/100;
				}
				
	}
	
	
	
}
