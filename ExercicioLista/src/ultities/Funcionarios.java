package ultities;

public class Funcionarios {
	
	private Integer id;
	private String name;
	private Double salary;
	
	
	
	
	public Funcionarios(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Double getSalary() {
		return salary;
	}




	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public void aument(double porcent) {
		double aumento = (porcent * this.salary) / 100;
		this.salary += aumento ;
	}
	
	@Override
	public String toString() {
	    return "ID: " + id
	            + ", Name: " + name
	            + ", Salary: $" + String.format("%.2f", salary);
	}
}
