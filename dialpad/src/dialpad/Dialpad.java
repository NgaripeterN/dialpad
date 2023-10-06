 package dialpad;

import java.util.Scanner;

public class Dialpad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do {

            System.out.println("\t\t\t\tCarrier info");
            System.out.println("0:Sh20 (30mins, 3hrs)");
            System.out.println("1:Sh10 (15Mins, 1hr)");
            System.out.println("2:Sh20 (15Mins, midnight)");
            System.out.println("3:Okoa 50");
            System.out.println("4:Okoa 20");
            System.out.println("5:0koa 10");
            System.out.println("6:0koa 5");
            System.out.println("7:Okoa 20 (900MB, 1hr)");
            System.out.println("8:Okoa Internet");
            System.out.println("98:More");
            
            
           
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
           
            switch (choice) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    // Display a new window that shows the unpaid okoa balance, the new okoa balance, and whether the customer accepts or denies being given the okoa.
                    System.out.println("Unpaid okoa:");
                    System.out.println("New okoa balance:");
                    System.out.println("Total okoa due will be:");
                    System.out.println("1.Acccept");
                    System.out.println("0.Back");
                    System.out.println("Enter your choice: ");
                    int backChoice = scanner.nextInt();
                    if (backChoice == 0) {
                    	break;
                    } else if (backChoice==1) {
                    	System.out.println("Okoa accepted.Thank you!");
                    }
	
                    else {
                    	System.out.println("Invalid choice");
                    }
                    	 
                 break;
                
                case 8:
                    // Display a new window that shows the unpaid okoa balance, the new okoa balance, and whether the customer accepts or denies being given the okoa.
                	System.out.println("\t\t\t\tCarrier info");
                	System.out.println("1:Sh20(900MB, 1hr)");
                    System.out.println("2:Sh 50(1400MB, 3hrs)");
                    System.out.println("3:Sh50(270MB,24hrs)");
                    System.out.println("4:Sh20(90MB, 24hrs)");
                    System.out.println("5:Sh10(30MB, 24hrs)");
                    System.out.println("6:Sh5(10MB, 24hrs)");
                    System.out.println("0.BACK");
                    System.out.println("Enter your choice: ");
                    int choice1 = scanner.nextInt();
                    if (choice1 == 0) {
                        break;
                    }
                    break;
                case 98:
                    // Display a new window that shows the unpaid okoa balance, the new okoa balance, and whether the customer accepts or denies being given the okoa.
                	System.out.println("\t\t\t\tCarrier info");
                	System.out.println("9:Okoa Minutes");
                    System.out.println("10:Okoa SMS");
                    System.out.println("11:Lipa okoa");
                    System.out.println("#:Check Balance");
                    System.out.println("0.BACK");
                    System.out.println("Enter your choice: ");
                    int choice0 = scanner.nextInt();
                    if (choice0 == 0) {
                        break;
                    }
                    break;
                
                default:
                    System.out.println("Invalid choice.");
            }

        } while (true);

    }

}

