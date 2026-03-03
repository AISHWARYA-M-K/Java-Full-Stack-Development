package Task_04;
import java.util.Scanner;
public class Simple_If {

	public static void main(String[] args) {
		int marks;
		Scanner op =new Scanner(System.in);
		System.out.println("Enter your marks: ");
		marks = op.nextInt();
		
		if(marks >= 36) {
			System.out.println("You are Pass");
		}

	}

}
