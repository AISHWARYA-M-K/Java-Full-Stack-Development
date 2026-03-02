package Task_03;
import java.util.Scanner;
public class Login_check {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);	
		
		System.out.println("Are you a registered user? ");
		String answer = op.nextLine();
		System.out.println();
		
		String username;
		String Password;
		
		if(answer.equals("yes") || answer.equals("no")) {
			System.out.println("Username: ");
			String Username = op.nextLine();
			System.out.println();
			System.out.println("Password: ");
			String password = op.nextLine();
			System.out.println();
			System.out.println();
			System.out.println("Login In");
			System.out.println("Username");
			String tempusername = op.nextLine();
			System.out.println();
			System.out.println("Password");
			String temppassword = op.nextLine();
			System.out.println();
			
			
			
			if(tempusername.equals(Username) && temppassword.equals(password)) {
			System.out.println("Login details matched successfully! `^_^`");
			}else {
			System.out.println("Login details not matched `>_<`");
			}
			
			
		}	
		
		else {
			System.out.println("enter the correct input 'yes' or 'no'");
		}
		
		

	}

}
