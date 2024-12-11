package selfcreated;
import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

	public static void main(String[] args) {
		double currency,pound,rupee,dollar,yen,ringgit,amount,code,euro;
		DecimalFormat f=new DecimalFormat("##.##");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Hii Welcome To The Currency Converter!");
		
		System.out.println("Which Currency You Want To Convert?");
		
		System.out.println(" 1:pound \n 2:dollar \n 3:rupee \n 4:yen \n 5:ringgit");
		code=sc.nextInt();
		
		System.out.println("How much money you want to convert");
		amount=sc.nextFloat();
		
		if(code==1) {
			dollar=amount/70;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(dollar)+ "Dollar" );
			
			pound=amount/88;
			System.out.println("Your"  +amount+  "Ruppe is"  +f.format(pound)+  "Pound");
			
			yen=amount/0.63;
			System.out.println("your"  +amount+  "Rupee is"  +f.format(yen)+  "Yen");
			
			ringgit=amount/16;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(ringgit)+  "ringgit");
			
			euro=amount/80;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(euro)+  "Euro");
		}
		else if(code==2) {
			rupee=amount*70;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(rupee)+  "Rupee");
			
			pound=amount*0.78;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(pound)+  "Pound");
			
			euro=amount*0.87;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(euro)+  "Euro");
			
			yen=amount*111.007;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(yen)+  "Euro");
			
			ringgit=amount*4.17;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(ringgit)+  "ringgit");
	   }
		else if(code==3) {
			rupee=amount*88;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(rupee)+  "Rupee");
			
		    dollar=amount*1.26;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(dollar)+  "Dollar");
			
			euro=amount*1.10;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(euro)+  "Euro");
			
			yen=amount*140.93;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(yen)+  "yen");
			
			ringgit=amount*5.29;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(ringgit)+  "ringgit");
		}
		else if(code==4) {
			rupee=amount*80;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(rupee)+  "Rupee");
			
		    dollar=amount*1.14;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(dollar)+  "Dollar");
			
			pound=amount*0.90;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(pound)+  "Pound");
			
			yen=amount*127.32;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(yen)+  "Yen");
			
			ringgit=amount*4.78;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(ringgit)+  "ringgit");
		}
		else if(code==5) {
			rupee=amount*0.63;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(rupee)+  "Rupee");
			
		    dollar=amount*0.008;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(dollar)+  "Dollar");
			
			pound=amount*0.007;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(pound)+  "Pound");
			
			euro=amount*0.007;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(euro)+  "Euro");
			
			ringgit=amount*0.037;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(ringgit)+  "ringgit");
		}
		else if(code==6) {
			rupee=amount*0.63;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(rupee)+  "Rupee");
			
		    dollar=amount*0.008;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(dollar)+  "Dollar");
			
			pound=amount*0.007;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(pound)+  "Pound");
			
			euro=amount*0.007;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(euro)+  "Euro");
			
			yen=amount*0.037;
			System.out.println("Your"  +amount+  "Rupee is"  +f.format(yen)+  "Yen");
		}
		else {
			System.out.println("Invalid Amount");
		}
		System.out.println("Thank You for choosing our example program");
	}

}
