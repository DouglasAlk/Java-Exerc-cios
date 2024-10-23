package Entities;

public class Company extends TaxPlayer {
    
	private int numberOfEmployees;
	
	
	public Company() {
		
	}
	
	public Company(String name, Double anauallcome, int numberOfEmployees) {
		super(name, anauallcome);
		this.numberOfEmployees = numberOfEmployees;
	}



	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}



	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}



	@Override
	public double tax() {
		double imp = 0;
		
		if(numberOfEmployees <= 10) {
			imp = getAnauallcome() * 0.16;
		}
		else {
			imp = getAnauallcome() * 0.14;
		}
		
		return imp;
	}

}
