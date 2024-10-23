import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas linhas vai ter cada matriz? ");
		int linhas = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int colunas = sc.nextInt();

		int matA[][] = new int[linhas][colunas];
		int matB[][] = new int[linhas][colunas];
        int matSoma [][] = new int [linhas][colunas];
		System.out.println("Digite os valores da matriz A:");

		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "] ");
				matA[i][j] = sc.nextInt();

			}
		}

		System.out.println("Digite os valores da matriz B:");

		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "] ");
				matB[i][j] = sc.nextInt();

			}
		}
		
		
		System.out.println("MATRIZ SOMA: ");
		
		for (int i=0 ; i<matSoma.length ; i++) {
			for (int j=0 ; j<matSoma[i].length ; j++){
				matSoma[i][j] = matA[i][j] + matB[i][j];  
			}
		}
		
		for (int[] soma : matSoma){
			for (int elementos : soma) {
				System.out.print(elementos + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
