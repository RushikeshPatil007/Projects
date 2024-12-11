package selfcreated;

import java.util.Scanner;

public class HotelManagmentSystem {

	public static void main(String[] args) {
		
		 int Maharashtrian_food = 0, Misal_pav = 0, Puran_poli = 0, Vada_pav = 0, Pav_Bhaji = 0, Pital_Bhakar = 0;
	        int South_Indian_food = 0, utthapa = 0, Idali_vada = 0, Masala_Dosa = 0, Vada_Sambar = 0, hydrabadi_birayani = 0;
	        int North_indian_foods = 0, Amritsar_chole_bhature = 0, kashmiri_Rogan_josh = 0, rajshthani_Dal_Bhati_churma = 0;
	        int Gujrati_foods = 0, Dhokla = 0, dabeli = 0, Phapda = 0, Gujrati_Thali = 0;
	        int Bengali_foods = 0, shukto = 0, Kosha_mangso = 0, Daab_Chingri = 0;
	        int Icecreams = 0, vanilla = 0, Amul_Cup = 0, Chokalate = 0, Cookie_Dough = 0, Toffee = 0;
	        int totalBill = 0;

	        Scanner sc = new Scanner(System.in);

	        while (true) {

	            menu:
	            System.out.println("************************************");
	            System.out.println("Welcome to the Indian Restaurant");
	            System.out.println("Please Enter Your Choice:");
	            System.out.println("To order Maharashtrian food,Enter 1 ");
	            System.out.println("To order South Indian food,Enter 2");
	            System.out.println("To order North Indian food,Enter 3");
	            System.out.println("To order Gujrati food,Enter 4");
	            System.out.println("To order Bangali food,Enter 5");
	            System.out.println("To order Icecreams,Enter 6 ");
	            System.out.println("************************************");
	            System.out.println("To Exit,Enter 8");
	            int ch = sc.nextInt();
	            switch (ch) {
	                case 1:
	                    while (true) {
	                        menu:
	                        System.out.println("Welcome to the Maharashtrian Food");
	                        System.out.println(" Misal Pav 60.00 Enter 1");
	                        System.out.println(" Puran Poli 120.00Enter 2");
	                        System.out.println(" Vada Pav 30.00 Enter 3");
	                        System.out.println(" Pav Bhaji 60.00 Enter 4");
	                        System.out.println(" Pital bhakar 100.00 Enter 5");
	                        int ch1 = sc.nextInt();
	                        switch (ch1) {
	                            case 1:
	                                System.out.println("How many plate Misal Pav you want");
	                                Misal_pav = sc.nextInt();
	                                break;
	                            case 2:
	                                System.out.println("How many plate puran Poli you want");
	                                Puran_poli = sc.nextInt();
	                                break;
	                            case 3:
	                                System.out.println("How many plate Vada Pav you want");
	                                Vada_pav = sc.nextInt();
	                                break;
	                            case 4:
	                                System.out.println("How many plate Pav bhaji you want");
	                                Pav_Bhaji = sc.nextInt();
	                                break;
	                            case 5:
	                                System.out.println("How many plate Pital Bhakar you want");
	                                Pital_Bhakar = sc.nextInt();
	                                break;
	                        }
	                        Maharashtrian_food = Misal_pav * 60 + Puran_poli * 120 + Vada_pav * 30 + Pav_Bhaji * 60 + Pital_Bhakar * 100;
	                        System.out.println("Enter 1 for continue ordering Maharashtrian food 0 for stop");
	                        int no = sc.nextInt();
	                        if (no == 0) {
	                            System.out.println("Your Bill is=" + Maharashtrian_food);
	                            break;
	                        }
	                    }
	                    break;
	                case 2:
	                    while (true) {
	                        menu:
	                        System.out.println("Welcome to the South Indian Food");
	                        System.out.println(" utthapa            40.00 Enter 1");
	                        System.out.println(" Idali Vada         30.00 Enter 2");
	                        System.out.println(" Masala Dosa        50.00 Enter 3");
	                        System.out.println(" Vada Sambar        30.00 Enter 4");
	                        System.out.println(" Hydrabadi biryani 120.00 Enter 5");
	                        int ch1 = sc.nextInt();
	                        switch (ch1) {
	                            case 1:
	                                System.out.println("How many plate utthapa you want");
	                                utthapa = sc.nextInt();
	                                break;
	                            case 2:
	                                System.out.println("How many plate Idali vada you want");
	                                Idali_vada = sc.nextInt();
	                                break;
	                            case 3:
	                                System.out.println("How many plate Masala Dosa you want");
	                                Masala_Dosa = sc.nextInt();
	                                break;
	                            case 4:
	                                System.out.println("How many plate Vada Sambar you want");
	                                Vada_Sambar = sc.nextInt();
	                                break;
	                            case 5:
	                                System.out.println("How many plate Hydrabadi Biryani you want");
	                                hydrabadi_birayani = sc.nextInt();
	                                break;
	                        }
	                        South_Indian_food = utthapa * 40 + Idali_vada * 30 + Masala_Dosa * 50 + Vada_Sambar * 30 + hydrabadi_birayani * 120;
	                        System.out.println("Enter 1 for continue ordering South Indian Food 0 for exit");
	                        int no = sc.nextInt();
	                        if (no == 0) {
	                            System.out.println("Your Bill is=" + South_Indian_food);
	                            break;
	                        }
	                    }
	                    break;
	                case 3:
	                    while (true) {
	                        menu:
	                        System.out.println("Welcome to the North Indian Food");
	                        System.out.println(" Amritsar chole bhature      250.00 Enter 1");
	                        System.out.println(" Kashmiri Rogan Josh         460.00 Enter 2");
	                        System.out.println(" Rajshthani Dal Bhati Churma 500.00 Enter 3");
	                        int ch1 = sc.nextInt();
	                        switch (ch1) {
	                            case 1:
	                                System.out.println("How many plate Amritsar chole bhature you want");
	                                Amritsar_chole_bhature = sc.nextInt();
	                                break;
	                            case 2:
	                                System.out.println("How many plate Kashmiri Rogan Josh you want");
	                                kashmiri_Rogan_josh = sc.nextInt();
	                                break;
	                            case 3:
	                                System.out.println("How many plate Rajshthani Dal bhati Churma you want");
	                                rajshthani_Dal_Bhati_churma = sc.nextInt();
	                                break;
	                        }
	                        North_indian_foods = Amritsar_chole_bhature * 250 + kashmiri_Rogan_josh * 460 + rajshthani_Dal_Bhati_churma * 500;
	                        System.out.println("Enter 1 for continue ordering 0 for exit");
	                        int no = sc.nextInt();
	                        if (no == 0) {
	                            System.out.println("Your Bill is=" + North_indian_foods);
	                            break;
	                        }
	                    }
	                    break;
	                case 4:
	                    while (true) {
	                        menu:
	                        System.out.println("Welcome to the Gujrati Food");
	                        System.out.println(" Dhokala        30.00  Enter 1");
	                        System.out.println(" Dabeli         40.00  Enter 2");
	                        System.out.println(" Phapda         20.00  Enter 3");
	                        System.out.println(" Gujrati Thali 230.00  Enter 4");
	                        int ch1 = sc.nextInt();
	                        switch (ch1) {
	                            case 1:
	                                System.out.println("How many plate Dhokala you want");
	                                Dhokla = sc.nextInt();
	                                break;
	                            case 2:
	                                System.out.println("How many plate Dabeli you want");
	                                dabeli = sc.nextInt();
	                                break;
	                            case 3:
	                                System.out.println("How many plate Phapda you want");
	                                Phapda = sc.nextInt();
	                                break;
	                            case 4:
	                                System.out.println("How many plate Gujrati Thali you want");
	                                Gujrati_Thali = sc.nextInt();
	                                break;
	                        }
	                        Gujrati_foods = Dhokla * 30 + dabeli * 40 + Phapda * 20 + Gujrati_Thali * 230;
	                        System.out.println("Enter 1 for continue ordering 0 for exit");
	                        int no = sc.nextInt();
	                        if (no == 0) {
	                            System.out.println("your bill is=" + Gujrati_foods);
	                            break;
	                        }
	                    }
	                    break;
	                case 5:
	                    while (true) {
	                        menu:
	                        System.out.println("Welcome to the Bengali foods ");
	                        System.out.println(" Shukto       50.00 Enter 1");
	                        System.out.println(" kosha mangso 80.00 Enter 2");
	                        System.out.println(" Daab chingri 40.00 Enter 3");
	                        int ch1 = sc.nextInt();
	                        switch (ch1) {
	                            case 1:
	                                System.out.println("How many plate Shukto  you want");
	                                shukto = sc.nextInt();
	                                break;
	                            case 2:
	                                System.out.println("How many plate kosha mangso you want");
	                                Kosha_mangso = sc.nextInt();
	                                break;
	                            case 3:
	                                System.out.println("How many plate Daab chingri you want");
	                                Daab_Chingri = sc.nextInt();
	                                break;
	                        }
	                        Bengali_foods = shukto * 50 + Kosha_mangso * 80 + Daab_Chingri * 40;
	                        System.out.println("Enter 1 for continue ordering 0 for exit");
	                        int no = sc.nextInt();
	                        if (no == 0) {
	                            System.out.println("Your bill is=" + Bengali_foods);
	                            break;
	                        }
	                    }
	                    break;
	                case 6:
	                    while (true) {
	                        menu:
	                        System.out.println("Welcome to the Icecream's Zone");
	                        System.out.println(" Vanilla      20.00 Enter 1");
	                        System.out.println(" Amul Cup     15.00 Enter 2");
	                        System.out.println(" Chokalate    30.00 Enter 3");
	                        System.out.println(" Cookie Dough 40.00 Enter 4");
	                        System.out.println(" Toffee       50.00 Enter 5");
	                        int ch1 = sc.nextInt();
	                        switch (ch1) {
	                            case 1:
	                                System.out.println("How many Vanilla you want");
	                                vanilla = sc.nextInt();
	                                break;
	                            case 2:
	                                System.out.println("How many Amul Cup you want ");
	                                Amul_Cup = sc.nextInt();
	                                break;
	                            case 3:
	                                System.out.println("How many Chokalate you want");
	                                Chokalate = sc.nextInt();
	                                break;
	                            case 4:
	                                System.out.println("How many Cookie Dough you want");
	                                Cookie_Dough=sc.nextInt();
	                                break;
	                            case 5:
	                                System.out.println("How many Toffee you want");
	                                Toffee=sc.nextInt();
	                                break;
	                        }
	                        Icecreams = vanilla * 20 + Amul_Cup * 15 + Chokalate * 30 + Cookie_Dough * 40 + Toffee * 50;
	                        System.out.println("Enter 1 for continue ordering 0 for exit");
	                        int no = sc.nextInt();
	                        if (no == 0) {
	                            System.out.println("Your bill is=" + Icecreams);
	                            break;
	                        }
	                    }
	                    break;
	                case 8:
	                    totalBill = Maharashtrian_food + South_Indian_food + North_indian_foods + Gujrati_foods + Bengali_foods + Icecreams;
	                    System.out.println("Your Total Bill is=" + totalBill);
	                    System.out.println("Add Amount for conferming your order");
	                    int bill = sc.nextInt();
	                    if (totalBill == bill) {
	                        System.out.println("Thank You From Team Indian Restaurant");
	                        System.out.println("Visit Again.....!");
	                    } else {
	                        System.out.println("Please Enter Your Bill For Your Order Conformation");
	                 }
	             }
	        }
	   }
   }
