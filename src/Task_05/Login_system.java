package Task_05;
import java.util.Scanner;
public class Login_system {

	public static void main(String[] args) {
		Scanner op= new Scanner(System.in);
		System.out.println("Are you a registered user? ");
		String answer = op.nextLine();
		System.out.println();
		
		String Username ="";
		String password ="";
		String tempusername ="";
		String temppassword = "";
		
		if(answer.equals("yes") || answer.equals("no")) {
			System.out.println("Username: ");
			Username = op.nextLine();
			System.out.println();
			System.out.println("Password: ");
			password = op.nextLine();
			System.out.println();
			System.out.println();
					
		}else {
			System.out.print("enter the correct word (yes/no)");
		}
		do {
			System.out.println("Login In");		
			System.out.println("Username");
			tempusername = op.nextLine();
			System.out.println();
			System.out.println("Password");
			temppassword = op.nextLine();
			System.out.println();
		
		}while(!tempusername.equals(Username) || !temppassword.equals(password));
		System.out.println("success ");
		
//		System.out.println("Enter Correct Uesrname or password ");
		
	}

}
