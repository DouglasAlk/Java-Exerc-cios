import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz?");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();

			}

		}
        System.out.println();
		System.out.println("Diagonal Principal: ");

		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}

		System.out.println("Numeros Negativos:");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}

		sc.close();

	}

}
