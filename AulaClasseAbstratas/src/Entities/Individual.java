package Entities;

public class Individual extends TaxPlayer {


	private Double healthExpenditures;
	
	public Individual() {
		
	}
	
	public Individual(String name, Double anauallcome, Double healthExpenditures) {
		super(name, anauallcome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double imp = 0;
		if(getAnauallcome() > 20000.00 ){
			imp = getAnauallcome() * 0.25;
		}
		else {
			imp = getAnauallcome() * 0.15;
		}
		
		return imp - (healthExpenditures * 0.50);
	}
	
	

}
