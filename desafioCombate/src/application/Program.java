package application;

import java.util.Locale;
import java.util.Scanner;

import mode.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura = sc.nextInt();
		
		Champion champion1 = new Champion(nome, vida, ataque, armadura);
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		vida = sc.nextInt();
		System.out.print("Ataque: ");
		ataque = sc.nextInt();
		System.out.print("Armadura: ");
		armadura = sc.nextInt();
		Champion champion2 = new Champion(nome, vida, ataque, armadura);
		
		
		System.out.print("Quantos turnos voce deseja executar? ");
		int turnos = sc.nextInt();
		
		for (int i=0; i < turnos; i++ ) {
			
			champion1.takeDamage(champion2);
			
			champion2.takeDamage(champion1);
            
		    System.out.println();
			System.out.println("Resultado do turno " + (i + 1) + ":");
		    System.out.println(champion1.getName() + ": " + champion1.getLife() +
		        (champion1.getLife() <= 0 ? " de vida (morreu)" : " de vida"));
		    System.out.println(champion2.getName() + ": " + champion2.getLife() +
		        (champion2.getLife() <= 0 ? " de vida (morreu)" : " de vida"));
		
			if (champion1.getLife() <= 0 || champion2.getLife() <= 0 ) {
				break;
			}
			
		
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
