package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter cliente data: ");
		System.out.print("NAME: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY)");
		Date date = sdf.parse(sc.next());
		
		Client client = new Client(name, email, date);
		
		System.out.print("Status: ");
		
		OrderStatus os = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), os, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i =0; i <n ; i++ ) {
			
			System.out.println("Enter #" + (i+1) + " item data:" );
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderiTem = new OrderItem(quantity, productPrice, product);
			
			order.Additem(orderiTem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
				
				
		
		sc.close();
		
		
	}

}
