package aplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ultities.Book;
import ultities.User;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Book> listBook = new ArrayList<>();
		List<User> listUser = new ArrayList<>();

		System.out.println("BEM VINDOS!");
		System.out.println("----------------MENU-----------------");
		System.out.println();
		String resp;
		while (true) {

			System.out.println("Escolha uma opção para continuar: 1, 2, 3, 4");
			System.out.println();
			System.out.println("1 ADICIONAR/ REMOVER LIVROS BIBLIOTECA!");
			System.out.println("2 REGISTRAR NOVO USUARIO! ");
			System.out.println("3 EMPRESTAR DEVOLVER LIVROS! ");
			System.out.println("4 SAIR DO PROGRAMA!");
			System.out.println();
			System.out.print("OPÇÃO:");
			int option = sc.nextInt();
			System.out.println();

			switch (option) {

			case 1:
				System.out.println(" 1 Adicionar ; 2 Remover? ");
				int subOption = sc.nextInt();

				if (subOption == 1) {
					System.out.println("Adicionando livros...");
					System.out.println();
				    sc.nextLine();


					do {
						System.out.print("Titulo: ");
						String title = sc.nextLine();
						System.out.print("Autor: ");
						String author = sc.nextLine();
						System.out.print("Ano: ");
						int year = sc.nextInt();

						Book livros = new Book(title, author, year);
						listBook.add(livros);

						System.out.print("Cadastrar outro? y/n ");
						sc.nextLine();
						resp = sc.nextLine();

					} while (resp.equals("y"));

				} else if (subOption == 2) {
					System.out.println("Removendo livros...");
					System.out.println();
					System.out.println("Livros cadastrados! ");
					System.out.println();

					for (Book list : listBook) {
						System.out.println(list);
					}

					boolean found = false;

					System.out.print("Nome do livro que deseja remover?: ");
					sc.nextLine();
					String name = sc.nextLine();
					Iterator<Book> iterator = listBook.iterator();

					while (iterator.hasNext()) {

						Book book = iterator.next();

						if (book.getTitle().equals(name)) {
							iterator.remove();
							found = true;
							System.out.println("Livro removido com Sucesso!");
							break;
						}

						if (!found) {

							System.out.println("Nenhum livro enctrato com o titulo: " + name);
							break;
						}

					}

				} else {
					System.out.println("Opçao inválida!");

				}

				break;

			case 2:

				System.out.println("1 Registrar user / 2 remover user ");
				System.out.print("OPÇÃO: ");
				int subResp = sc.nextInt();

				if (subResp == 1) {
					int continuarCad = 0;
					do {
						sc.nextLine();
						System.out.print("Nome do Usuario: ");
						String name = sc.nextLine();
						System.out.print("Numero de telefone: ");
						double number = sc.nextDouble();
						System.out.print("Email: ");
						sc.nextLine();
						String email = sc.nextLine();

						User user = new User(name, number, email);
						listUser.add(user);

						System.out.println("Deseja cadastrar mais? sim = 1 | não = 2 ");
						continuarCad = sc.nextInt();
					} while (continuarCad == 1);

				} else if (subResp == 2) {

					System.out.println("LISTA DOS USERS CADASTRADOS: ");
					System.out.println();

					for (User user : listUser) {

						System.out.println(user);
					}

					System.out.println();
					System.out.print("QUAL NOME DE USUARIO QUE DESEJA REMOVER?: ");
					sc.nextLine();
					String userRemov = sc.nextLine();

					Iterator<User> iterator = listUser.iterator();
					boolean found2 = false;
					while (iterator.hasNext()) {

						User user = iterator.next();

						if (user.getName().equals(userRemov)) {
							iterator.remove();
							found2 = true;
							System.out.println("User removido com Sucesso!");
							break;
						}

						if (!found2) {

							System.out.println("Nenhum User enctrato com esse nome: " + userRemov);
							break;
						}
						System.out.println();
					}

				} else {
					System.out.println("Opção invalida!");
				}

				break;

			case 3:
				
				System.out.println();
				System.out.println(" 1 EMPRESTAR | 2 DEVOLVER ");
				System.out.println();
				System.out.println("OPÇÃO: ");
				int respLivro = sc.nextInt();
				
				if(respLivro == 1) {
					
				}else if (respLivro == 2) {
					
				}else {
					System.out.println("Opção invalida!");
				}
				
				
				
				break;

			case 4:

				System.out.println("Saindo do programa...");
				sc.close();
				System.exit(0);

			default:

				System.out.println("Escolha inválida, tente novamente!");
				break;

			}

		}

	}

}
