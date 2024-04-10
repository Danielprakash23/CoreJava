package puzzle;

import java.util.Scanner;

public class UserIntrface {

	

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        NumAvg numAvg = new NumAvg();
		        int option;
		        do {
		            System.out.println("1. Add number");
		            System.out.println("2. Find Average");
		            System.out.println("3. Exit");
		            System.out.print("Enter your choice: ");
		            option = scanner.nextInt();
		            switch (option) {
		                case 1:
		                    System.out.print("Enter a number: ");
		                    int num = scanner.nextInt();
		                    numAvg.addNum(num);
		                    break;
		                case 2:
		                    double average = numAvg.calAvg();
		                    if (average == 0) {
		                        System.out.println("The set is empty");
		                    } else {
		                        System.out.println("The average is: " + average);
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
		
			
		




