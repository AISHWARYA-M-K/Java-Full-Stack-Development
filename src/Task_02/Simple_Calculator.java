package Task_02;
import java.util.Scanner;
public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num 1:");
		int num_1 = sc.nextInt();
		System.out.println("num 2:");
		int num_2 = sc.nextInt();
		System.out.println("enter the operator: ");
		String op = sc.next();
		
		int result=0;
		
		switch(op) {
		
		case "+":
			result = num_1 + num_2;
			System.out.println(result);
			break;
		
		case "-":
			result = num_1 - num_2;
			System.out.println(result);
			break;
			
		case "*":
			result = num_1 * num_2;
			System.out.println(result);
			break;
		case "/":
			result = num_1 / num_2;
			System.out.println(result);
			break;
		case "%":
			result = num_1 % num_2;
			System.out.println(result);
			break;
			
		default:
			System.out.println("please enter the correct operator");

		}
	}

}
