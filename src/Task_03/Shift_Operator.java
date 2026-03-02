package Task_03;

import java.util.Scanner;
public class Shift_Operator {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = op.nextInt();
		
//		using right shift operator
		int result = num >> 3;
		System.out.println("The result of using right shift operator is "+result);
		
//		using left shift operator
		int Result = num << 2;
		System.out.println("The result of using right shift operator is "+Result);
	}

}
