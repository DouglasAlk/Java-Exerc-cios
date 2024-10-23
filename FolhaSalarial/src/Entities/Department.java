package Entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;

	private List<Employee> emp = new ArrayList<>();
	private Address address;

	public Department() {

	}

	public Department(String name, Integer payDay) {
		this.name = name;
		this.payDay = payDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public List<Employee> getEmp() {
		return emp;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void AddEmployee(Employee item) {
		emp.add(item);

	}

	public void RemovEmployye(Employee item) {
		emp.remove(item);
	}

	public double payroll() {
		double total = 0;
		
		for (Employee pag : emp) {
			total += pag.getSalary();
		}		
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento Vendas = " + String.format("%.2f", payroll()) + "\n");
		sb.append("Pagamento realizado no dia " + payDay + "\n");
		sb.append("Funcionários: " + "\n");
		for(Employee func : emp) {
			sb.append(func.getName() + "\n");
		}
		
		sb.append("Para duvidas favor entrar em contato: " + address.getEmail());
		
		return sb.toString();
	}
	
}
