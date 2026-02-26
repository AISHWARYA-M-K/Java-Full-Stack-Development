package Task_02;
import java.util.Scanner;
public class Password_validation {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = op.next();
        String check_psw ;
        System.out.println(""" 
                         do you want to check the password?
                         Enter 'Y' for Yes and 'N' for No! 
                         """ );
        char ch = op.next().charAt(0);
        if(ch =='Y'|| ch == 'y'){
            System.out.println("Enter your password again: ");
            check_psw = op.next();
            if (check_psw.equals(password)){
                System.out.println("Password is matching");
            }else{
                System.out.println("password is mismatched");
            }
        }else {
        	System.out.println("okae program terminated '-'");
        }

	}

}
