package Task_05;
import java.util.Scanner;
public class ATM_withdrawal {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		double withdraw =0;
		System.out.print("Do you want to withdraw from your bank account?(Yes/No) Type--> ");
		String output = op.nextLine();
		
		if(output.equals("yes")) {
			System.out.println("enter the total amt in your bank account: ");
			double total_amt = op.nextDouble();
			
			while(total_amt > 0) {
				System.out.println("enter the amount you want to withdraw: ");
				withdraw = op.nextDouble();
				if(withdraw > total_amt) {
					System.out.println("Insufficient balance");
					continue;
				}else {
					System.out.println("withdraw is successfull");
				}
				total_amt -= withdraw;
			}
				
			
		}else {
			System.out.println("Why you still here `~_~`? haaa!!!");
		}

	}

}
