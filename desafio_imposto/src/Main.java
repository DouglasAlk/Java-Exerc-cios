import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salaM, rendS, rendP, rendC, gastM, gastE, impoS, impoP, impoC, gastD, maxGastD, impostoBruto, imposDev;

		impoS = 0;

		System.out.print("Renda anual com salário: ");
		rendS = sc.nextDouble();
		System.out.print("Renda anual com Prestação de serviço: ");
		rendP = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendC = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastM = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastE = sc.nextDouble();
		System.out.print("");

		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("");

		System.out.println("CONSOLIDADE DE RENDA");

		// salarioMensal

		salaM = rendS / 12;

		// CauculandoImpostoSalario

		if (salaM < 3000) {

			System.out.println("Imposto sobre salário: isento");
		}

		else if (salaM < 5000) {

			impoS = rendS * 0.1;
			System.out.printf("Imposto sobre salário: %.2f\n", impoS);
		}

		else {

			impoS = rendS * 0.2;
			System.out.printf("Imposto sobre salário: %.2f\n", impoS);
		}

		// ImpostoSobreServiço

		impoP = rendP * 0.15;
		System.out.printf("Imposto sobre serviços: %.2f\n", impoP);

		// ImpostoSobreGanhoDeCapital

		impoC = rendC * 0.2;
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impoC);
		System.out.println("");

		System.out.println("DEDUÇÕES:");

		// CauculoImpostoBruto
		// CauculoDeGastosDedutiveis

		impostoBruto = impoS + impoP + impoC;
		gastD = gastM + gastE;
		maxGastD = impostoBruto * 0.3;

		System.out.printf("Máximo dedutível: %.2f\n", maxGastD);
		System.out.printf("Máximo dedutível: %.2f\n", gastD);
		System.out.println("");

		System.out.println("RESUMO:");

		System.out.printf("Imposto bruto total: %.2f\n", impostoBruto);

		if (maxGastD > gastD) {

			System.out.printf("Abatimento: %.2f\n", gastD);

			imposDev = impostoBruto - gastD;
			System.out.printf("Imposto devido: %.2f\n", imposDev);
		}

		else {

			System.out.printf("Abatimento: %.2f\n", maxGastD);

			imposDev = impostoBruto - maxGastD;
			System.out.printf("Imposto devido: %.2f\n", imposDev);
		}

		sc.close();

		// ByDouglas
		// #DevSuperior
	}

}