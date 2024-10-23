package Entities;

public class Employee {
	
	private String name;
	private Double Salary;
	
	public Employee() {
		
	}

	public Employee(String name, Double salary) {
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String toString() {
		
		return name + "/n";
	}
}
