package Task_05;
import java.util.Scanner;
public class Online_Shopping_order_Processing {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		System.out.println("Enter the bunch of orders came:");
		long orders = op.nextLong();
		
		System.out.println("Enter the Quantity of product");
		long quantity = op.nextLong();
		
		System.out.println("Enter the total amount of the Quantity of product");
		double order_amt = op.nextDouble();
		
		for(int i =0; i<= orders; i++) {
		if(order_amt == 0) {
			System.out.println("order invalid");
			continue;
		}else if(order_amt < 10000){
			System.out.println("Small order");
			break;
		}else if(order_amt > 20000){
			System.out.print("Big order");
			return;
		}
		}
		
		
	}

}
