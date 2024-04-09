package departmentalStore;

import java.util.Scanner;

public class mainDs {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in );
		    System.out.println("Enter the Customer name");
		    String name = obj.nextLine();
		    System.out.println("Enter the customer phone number");
		    String phnum = obj.nextLine();
		    System.out.println("Enter the street name");
		    String stname = obj.nextLine();
		    System.out.println("Enter the bill amount");
		    double amount = obj.nextDouble();
		    System.out.println("Enter the distance");
		    int distance = obj.nextInt();
		    customerdetails c1 = new customerdetails(name,phnum,stname,amount,distance);
		    System.out.println(c1.toString());
		    		
		    
		    
		
		
	

	}

}
