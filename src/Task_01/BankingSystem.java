package Task_01;
import java.util.Scanner;
public class BankingSystem {
	
	public static void main(String []args) {
	Scanner op = new Scanner(System.in);
	
//	reading input from users
	System.out.println("Enter the bank account holder name: ");
	String account_holder = op.nextLine();
	
	System.out.println("Enter the account number: ");
	long account_no = op.nextLong();
	
	System.out.println(account_holder+" enter your bank balance please ^_^");
	double balance = op.nextDouble();
	
	boolean Active = true;
	
//	checking condition
	if (balance >= 500){
		System.out.println("The account is " +Active+ " Is Active");
	}else {
		System.out.println("The account is " + !Active + "Is Not Active");
	}
	
	}
	
}
