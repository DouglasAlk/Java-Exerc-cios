package application;

import java.util.Locale;
import java.util.Scanner;

import ultilidades.Funcoes;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		Funcoes func;
		
		if (resp == 'y') {
		
			System.out.print("Enter inicial deposit value: ");
		    double deposit = sc.nextDouble(); 
			 func = new Funcoes(name, number, deposit);
		}
		else {
			 func = new Funcoes(name, number);

		}	
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(func);
	

		System.out.println();
		System.out.print("Enter deposit value: ");
		double deposit = sc.nextDouble();
		func.deposit(deposit);
		System.out.println("Update account data: ");
		System.out.println(func);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		func.withdraw(saque);
		System.out.println("Updated account data: ");
		System.out.println(func);
	
		sc.close();
	}

}
