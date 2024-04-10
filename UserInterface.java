package com.HashMap;

import java.util.Scanner;

public class UserInterface {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Country country = new Country();
	        int option;

	        do {
	            System.out.println("1. Add\n2. Search\n3. Exit");
	            System.out.print("Enter your choice: ");
	            option = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (option) {
	                case 1:
	                    System.out.print("Enter country name: ");
	                    String countryName = scanner.nextLine();
	                    System.out.print("Enter capital name: ");
	                    String capitalName = scanner.nextLine();
	                    country.add(countryName, capitalName);
	                    break;
	                case 2:
	                    if (country.getCountryMap().isEmpty()) {
	                        System.out.println("The map is empty");
	                    } else {
	                        System.out.print("Enter country name to search for its capital: ");
	                        countryName = scanner.nextLine();
	                        String capital = country.search(countryName);
	                        System.out.println("Capital: " + capital);
	                    }
	                    break;
	                case 3:
	                    System.out.println("Thank you for using the application");
	                    break;
	                default:
	                    System.out.println("Invalid option! Please enter 1, 2, or 3.");
	            }
	        } while (option != 3);

	        scanner.close();
	    }
	}


