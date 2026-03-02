package Task_02;
import java.util.Scanner;
public class Countdown_timing {

	public static void main(String[] args) {
		Scanner op= new Scanner(System.in);
		System.out.println("Enter the count down in seconds");
		int count_down = op.nextInt();
		
		for(int i = 0; i<=count_down; i++) {
			System.out.print(i+"\r");
		}
	}

}
