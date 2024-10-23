package ultities;

public class TaxPayer {

	private static final double HIGH_SALARY_TAX_RATE = 0.20; // 20%
	private static final double MEDIUM_SALARY_TAX_RATE = 0.10; // 10%
	private static final double SERVICE_TAX_RATE = 0.15; // 15%
	private static final double CAPITAL_TAX_RATE = 0.20; // 20%
	private static final double MAX_REBATE_RATE = 0.30; // 30%

	private double salaryIncome, serviceIncome, capitalIncome, healthSpending, educationSpending;

	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	private double calculateTax(double income, double rate) {
		return income * rate;
	}

	public double salaryTax() {
		
		double salaryMes = salaryIncome / 12;
		
		if (salaryMes >= 5000) {
			return calculateTax(salaryIncome, HIGH_SALARY_TAX_RATE);
		} else if (salaryMes >= 3000) {
			return calculateTax(salaryIncome, MEDIUM_SALARY_TAX_RATE);
		}
		return 0;
	}

	public double servicesTax() {
		return calculateTax(serviceIncome, SERVICE_TAX_RATE);
	}

	public double capitalTax() {
		return calculateTax(capitalIncome, CAPITAL_TAX_RATE);
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double grossTaxes = grossTax();
		double maxRebate = grossTaxes * MAX_REBATE_RATE;
		double totalSpending = healthSpending + educationSpending;
		return Math.min(maxRebate, totalSpending);
	}

	public double netTax() {
		return grossTax() - taxRebate();
	}

	@Override
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n" 
	         + "Abatimento: " + String.format("%.2f", taxRebate()) + "\n" 
		     + "Imposto devido: " + String.format("%.2f", netTax()) + "\n";
	}
}
