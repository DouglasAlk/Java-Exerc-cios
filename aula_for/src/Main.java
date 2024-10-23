import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Quantas vezes repetir: ");
		x = sc.nextInt();
		
		for (int i=0 ; i != x ; x--) {
			
			try {
			    Thread.sleep(1000);  // Pausa por 1000 milissegundos (1 segundo)
			} catch (InterruptedException e) {
			    // Aqui você poderia registrar a exceção ou tratar de alguma forma
			    Thread.currentThread().interrupt(); // Reinterrompe a thread se necessário
			}
			
			System.out.println(x);		
		}
		sc.close();
		
	
		
	}

}
