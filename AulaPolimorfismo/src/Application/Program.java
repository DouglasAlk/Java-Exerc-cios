package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n;i++) {
			
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
		    String name = sc.next();
		    System.out.print("Price: ");
		    double price = sc.nextDouble();
	
				
			if (resp == 'c') {
				list.add(new Product(name, price));
			}
			
			else if (resp == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name,price,date));
			}
			
			else {
				System.out.print("Customs fee:  ");
				double taxa = sc.nextDouble();
				list.add(new ImportedProduct(name,price,taxa));
			}
			
		}
		
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product produc : list) {
			   System.out.println(produc.priceTag());
		}
		sc.close();
		
		

	}

}
