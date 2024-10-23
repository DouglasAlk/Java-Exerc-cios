package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		double nFinal = aluno.notaFinal();

		System.out.printf("NOTA FINAL = %.2f%n", nFinal);

		if (nFinal < 60) {
			System.out.println("FAILED");

			double pontosF = 60 - nFinal;

			System.out.printf("FALTARAM %.2f Pontos%n", pontosF);

		} else {
			System.out.println("PASS");

		}

		sc.close();

	}

}
