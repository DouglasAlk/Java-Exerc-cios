package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ultities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
	    int n = sc.nextInt();
	    
	    List<Funcionarios> list = new ArrayList<>();
	    
	    for (int i=0; i<n; i++) {
	    	
	    	System.out.println("Emplyoee #" + (i+1));
	    	System.out.print("Id: ");
	    	Integer id = sc.nextInt();
	    	System.out.print("Name: ");
	    	sc.nextLine();
	    	String name = sc.nextLine();
	    	System.out.print("Salary: ");
	    	Double salary = sc.nextDouble();
	    	
	        Funcionarios func = new Funcionarios(id, name, salary);
	        list.add(func);
	    	
	    }
	    
	    boolean idFound = false;
	    System.out.print("Enter the employee id tha will habe salary increase: ");
	    int idToIncrease = sc.nextInt();
	   
	    for (Funcionarios porc : list){
	    	
	    	if (porc.getId() == idToIncrease) {
	    		System.out.print("Enter the porcentage: ");
	    	    Double percent = sc.nextDouble();
	    	    porc.aument(percent);
	    	    idFound = true;
	    	    break;
	    	}
	    	
	    }
	    
	    if(!idFound){
	    	System.out.println("This ID does not exist!");
	    }
		
	    System.out.println("Updated employee list: ");
	    for (Funcionarios emp : list){
	    	System.out.println(emp);
	    }
	    
		sc.close();
	}

}
