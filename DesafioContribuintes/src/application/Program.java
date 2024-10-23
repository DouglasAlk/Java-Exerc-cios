package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ultities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes voce vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i =0; i<n; i++) {
			
			System.out.println("Digite os dados do " + (i+1) +"o contribuinte: ");
			System.out.print("Renda anual com salário: ");
			double salario = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capital = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			double saude = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educacao = sc.nextDouble();
			System.out.println();
			
			TaxPayer payer = new TaxPayer(salario, servico, capital, educacao, saude);
			list.add(payer);
			
		}
		
		
		for(int i=0; i < list.size(); i++) {
			TaxPayer resum = list.get(i);
			System.out.println("Resumo do " + (i + 1) + "º contribuinte:");
			System.out.println(resum);
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
