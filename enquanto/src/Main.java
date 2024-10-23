import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = 0, a = 0;
		n = sc.nextDouble();
		a += n;
		
		while (n != 0) {
			
			System.out.println("DIGITE DENOVO");
			n = sc.nextDouble();
			a += n; 
		}
		
		System.out.println("VALOR: " + a);
		
		
		
		
		sc.close();
	}

}
