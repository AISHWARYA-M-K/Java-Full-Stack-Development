package Task_02;
import java.util.Scanner;
public class Bonus_multiplier {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		System.out.println("""
				For every purpchase made over INR 500/- !!!!
				you will get 100 points in Shops Membership card.
				
				The points will be double for every 500/- purchase!!!!
                            """);
		
//		getting purchased amount from the user to claim points.
		System.out.println("Please enter your purchased amount here!!");
		double purchase_Amt = op.nextDouble();
		
		int Bonus_points = 0;
		
		int no_of_500 = (int)purchase_Amt / 500;
		Bonus_points = 100*no_of_500;
		
		System.out.println(Bonus_points+" points added to your membership card!!");
		System.out.println("purchase again! `> _ <`, see you later ;)");
		
		
	}

}
