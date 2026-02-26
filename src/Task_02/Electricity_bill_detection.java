package Task_02;
import java.util.Scanner;
public class Electricity_bill_detection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units used: ");
		double units = sc.nextInt();
		double bill = 0;
		
		if(units <= 100) {
			bill = 100 * 1.5;
		}else if(units >= 101 && units <=200) {
			bill = 100 * 1.5 + (units -100)*2.5; 
		}else if(units >= 201 && units <=300) {
			bill = 100 * 1.5 + (units - 100) * 2.5 + (units - 200) * 4.0;
		}else {
			bill = 100 * 1.5 + (units - 100) * 2.5 + (units - 200) * 4.0 + 6;
		}
		
		System.out.println("The Electricity bill detection: " + bill);
	}

}
