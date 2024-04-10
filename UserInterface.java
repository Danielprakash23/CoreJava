package com.Shopingcart;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	Products products = new Products();
	int option;
	do {
		System.out.println("1.Add\n2.Display\n3.Exit");
		System.out.println("Enter your choice");
		option = scanner.nextInt();
		scanner.nextLine();
		
		switch(option) {
		case 1:
			System.out.println("Enter the product name");
			String product = scanner.nextLine();
			
			products.addProductToList(product);
					break;
		case 2:
			products.sortProductList();
				ArrayList<String> productList = products.getProductList();
					if (productList.isEmpty()) {
						System.out.println("The list is empty");
						
					
					}else {
						System.out.println("products in alphabetical order:");
						for (String product1 : productList) {
							System.out.println(product1);
							
							
						}
					}
					break;
		case 3:
			System.out.println("Thank you for using the application");
					break;
					default:
						System.out.println("Invalid option! please enter 1,2 or 3.");
						
		}
		
		
		
	}while (option != 3);
	scanner.close();
	}

}
