package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Salario Bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Funcionario: " + emp);
		System.out.print("Qual porcentagem para aumentar o salario? ");
		double porcent = sc.nextDouble();
		emp.increaseSalary(porcent);
		System.out.printf("Dados atuliados: " + emp);

		sc.close();
	}

}
