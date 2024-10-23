import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linha = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int coluna = sc.nextInt();
		
		int mat[][] = new int [linha][coluna];
		
		for (int i=0 ; i < mat.length ; i++) {
			for (int j=0 ; j < mat[i].length ; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		
		for(int i=0 ; i < mat.length ; i++) {
			for(int j=0 ; j < mat[i].length ; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		
		sc.close();
	}

}
