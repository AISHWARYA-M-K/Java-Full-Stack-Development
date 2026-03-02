package Task_03;
import java.util.Scanner;
public class Find_the_largest_and_smallest_number {

	public static void main(String[] args) {
		Scanner op =new Scanner(System.in);
		
		System.out.println("enter num1: ");
		double num1 = op.nextDouble();
		System.out.println("enter num2: ");
		double num2 = op.nextDouble();
		double max = (num1 > num2)?num1: num2;
		double min = (num1 < num2)?num1: num2 ;
		System.out.println("the maximun highest number is "+max);
		System.out.println("The minimun and smallest number is "+min);
	
	}
		
	}


