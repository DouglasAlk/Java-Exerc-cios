package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter Work data: ");
		System.out.print("Nome: ");
		String workerName = sc.next();
		sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.next();
		System.out.print("Base Salary: ");
		double bSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), bSalary, new Department(departmentName));
	
		System.out.println("How many contracts to this worker? ");
		int quantitycontracts = sc.nextInt();

		for (int i = 1; i <= quantitycontracts; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valorhora = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			Contract contract = new Contract(contractDate, valorhora, hours);
			worker.AddContract(contract);

		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


		sc.close();
	}

}
