package Task_02;
import java.util.Scanner;
public class Wallet_updating {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
//		getting the current wallet amount from the user.
		System.out.println("Your current wallet amount: ");
		double current_wallet_amt = op.nextDouble();
		
//		asking the user what operation needed.
		System.out.println("""
				Do you want to credit or debit?
				if crediting type 'c' and for debiting 'd'.
				 """);
		char o = op.next().charAt(0);
		
		if(o == 'c' || o == 'C') {
			System.out.println("Enter the amount you want to credit: ");
			double credit_amt = op.nextDouble();
			System.out.println("The amount is credited to your wallet!");
			double updated_wallet_amt = current_wallet_amt + credit_amt;
			System.out.println("your updated wallet amount is: " + updated_wallet_amt);
		}else if( o == 'd' || o == 'D') {
			System.out.println("Enter the amount you want to debit: ");
			double debit_amt = op.nextDouble();
			System.out.println("The amount is debited from your wallet!");
			double updated_wallet_amt = current_wallet_amt - debit_amt;
			System.out.println("your updated wallet amount is: " + updated_wallet_amt);
		}else {
			System.out.println("Error occured! enter the correct input as given above.");
		}
	  
		double updated_wallet_amt;
		double credit_amt;
		double debit_amt;
		
		
	}

}
