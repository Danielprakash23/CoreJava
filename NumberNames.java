package example;

import java.util.Scanner;

public class NumberNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        String number = scanner.nextLine();
	        scanner.close();

	        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	        for (int i = 0; i < number.length(); i++) {
	            int digit = Character.getNumericValue(number.charAt(i));
	            System.out.print(numberNames[digit] + " ");
	        }
	}

}
