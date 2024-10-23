package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double bsalary;

	private Department department;
	private List<Contract> contracts = new ArrayList<>();

	public Worker() {

	}


	public Worker(String name, WorkerLevel level, Double bsalary, Department department) {

		this.name = name;
		this.level = level;
		this.bsalary = bsalary;
		this.department = department;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBsalary() {
		return bsalary;
	}

	public void setBsalary(Double bsalary) {
		this.bsalary = bsalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Contract> getContracts() {
		return contracts;
	}

    public void AddContract(Contract contract) {
    	contracts.add(contract);
    	
    }
    
    public void RemovContract(Contract contract) {
    	contracts.remove(contract);
    }
    
    public double income(int year, int month) {
        double soma = bsalary;
        Calendar cal = Calendar.getInstance();
        
        for (Contract c : contracts) {
            if (c.getDate() != null) { 
                cal.setTime(c.getDate());
                int c_year = cal.get(Calendar.YEAR);
                int c_month = 1 + cal.get(Calendar.MONTH); 
                if (year == c_year && month == c_month) {
                    soma += c.totalValueContract();
                }
            } else {
                System.out.println("Erro: Data do contrato é nula.");
            }
        }
        
        return soma;
    }

}
