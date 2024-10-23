package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPlayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    List<TaxPlayer> list = new ArrayList<>();
	    
	    
	    System.out.print("Enter the number of tax payers: ");
	    int n = sc.nextInt();
	    
	    for(int i=0; i<n; i++) {
	    	
	    	System.out.println("Tax Payer#" + i + " data:");
	    	System.out.print("Individual or company (i/c)? ");
	    	char resp = sc.next().charAt(0);
	    	System.out.print("Name: ");
	    	sc.nextLine();
	    	String name = sc.nextLine();
	    	System.out.print("Anual income: ");
	    	double income = sc.nextDouble();
	    	
	    	if(resp == 'i'){
	    		System.out.print("Health expenditures: ");
	    		double healtExpenditures = sc.nextDouble();
	    		
	    		list.add(new Individual(name, income, healtExpenditures));
	    	}
	    	
	    	else {
	    		System.out.print("Number of employees: ");
	    		int employees = sc.nextInt();
	    		list.add(new Company(name, income, employees));
	    		
	    	}
	    	
	    	
	    	}
	    
	    System.out.println();
    	System.out.println("TAXES PAID:");
    	
    	for(TaxPlayer c : list){
    		System.out.println(c.getName() 
    				+ ": $ " + String.format("%.2f", c.tax()));
	    	
	    }
		
    	double total = 0;
    	for(TaxPlayer c : list){
    		
	    	total += c.tax();
	    }
    	
    	
    	System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f",total));
		sc.close();
	}

}
