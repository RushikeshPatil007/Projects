package selfcreated;

import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 100000;
        int withdraw;
        int deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Wlocome to the SBI ATM");
            System.out.println("Press 1 for Withdraw");
            System.out.println("Press 2 for deposit");
            System.out.println("Press 3 for balance enquiry");
            System.out.println("Press 4 for Exit");
            System.out.print("Choose the operation you want to be perform:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter money to withdraw");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw){
                        System.out.println("Collect your money");
                        System.out.println("Thank you from SBI");
                        System.out.println("Visit Again!");
                    }
                    else{
                        System.out.println("Insuffisient Money");
                        System.out.println("Please collect your card");
                        System.out.println("Thank you from SBI");
                        System.out.println("Visit Again!");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Deposit Your Money:");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Thank you from SBI");
                    System.out.println("Visit Again!");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\nYour balance is:"+balance);
                    System.out.println("Thank you from SBI");
                    System.out.println("Visit Again!");
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
                
            }
          break;
        }
	}

}
