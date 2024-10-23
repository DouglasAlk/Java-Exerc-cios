package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Address;
import Entities.Department;
import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String nameDepartment = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer payDay = sc.nextInt();
		
		Department dep = new Department(nameDepartment, payDay);

		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone:");
		String phone = sc.nextLine();
		
		Address ad = new Address(email, phone);
		
		dep.setAddress(ad);
		
		
		System.out.print("Quantos funcionarios tem o departamento? ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Dados do funcionario " + (i+1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			
			Employee empss = new Employee(name, salary);
			
			dep.AddEmployee(empss);
			
		}
		
		
		
		System.out.println();
		
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.println(dep);
		
		
		
		
		sc.close();

	}

}
