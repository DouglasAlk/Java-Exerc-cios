import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linha = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int coluna = sc.nextInt();
		
		int mat[][] = new int [linha][coluna];
		
	
		
		for (int i=0 ; linha > i ;i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha:");
			for (int j=0; mat[i].length > j; j++) {
				mat[i][j] = sc.nextInt();
				
				
			} 
			
		}
		
		int[] vetor = new int[linha];
		
		
		System.out.println("VETOR GERADO: ");
		
		
		
		for (int i=0 ; i < mat.length ; i++) {
			
			int soma = 0;
			for (int j=0 ; j < mat[i].length ; j++){
				soma += mat[i][j] ;
			}
		  vetor[i] = soma;
		}
		
		for (int i=0 ; i<linha ; i++) {
			System.out.println(vetor[i]);
		}
		
		sc.close();

	}

}
