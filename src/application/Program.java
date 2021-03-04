package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();		
		System.out.print("Email: ");
		String email = sc.nextLine();		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("\nEnter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(client, new Date(), OrderStatus.valueOf(status));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nEnter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			name = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem o = new OrderItem(quantity, price, new Product(name, price));
			order.addItem(o);
		}
		
		System.out.println(order);
		
		sc.close();

	}

}
