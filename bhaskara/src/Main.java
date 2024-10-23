import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double coeficienteA, coeficienteB, coeficienteC, delta, x1, x2;

		System.out.print("Coeficiente a: ");
		coeficienteA = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		coeficienteB = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		coeficienteC = sc.nextDouble();
		sc.close();

		delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);

		if (delta > 0) {

			x1 = ((-coeficienteB) + Math.sqrt(delta)) / (2 * coeficienteA);
			x2 = ((-coeficienteB) - Math.sqrt(delta)) / (2 * coeficienteA);

			System.out.printf("Coeficiente X1: %.4f%n", x1);
			System.out.printf("Coeficiente X1: %.4f%n", x2);

		} else {
			System.out.println("Esta equação nao possui raizes reais");

		}

	}

}
