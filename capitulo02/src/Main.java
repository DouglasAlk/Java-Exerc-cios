import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double nota1, nota2, notaf;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notaf = nota1 + nota2;
		
		if(notaf >= 60 ) {
			
			System.out.printf("NOTA FINAL = %.2f%n", notaf);
			
		}
		else {
		    System.out.printf("REPROVADO = %.2f%n", notaf);
		
		}
		sc.close();
	}

}
