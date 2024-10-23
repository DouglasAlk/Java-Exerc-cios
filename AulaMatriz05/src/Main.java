import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		int mat [][] = new int [n][n];
		
		
        for (int i=0 ; i < mat.length ; i++){
        	for (int j=0 ; j < mat[i].length ; j++) {
        		System.out.print("Elemento [" + i + "," + j + "]: ");
        		mat[i][j] = sc.nextInt();
        		
        	}
        	
        }	
        
       
        
        
        int soma = 0;
        for (int i=0 ; i < mat.length ; i++){
        	for (int j = i + 1  ; j < mat[i].length ; j++) {	
        		soma += mat[i][j];
      
        	}
        	
        }	
        
        System.out.println("soma dos elementos acima da diagonal principal = " + soma);
        
		sc.close();
		
		
		
	}

}
