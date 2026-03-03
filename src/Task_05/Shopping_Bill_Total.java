package Task_05;
import java.util.Scanner;
public class Shopping_Bill_Total {

	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		
		double Shopping_bill_total =0;
		
		System.out.println("Enter the no of items in the Cart: ");
		int cart = op.nextInt();
		
		for(int i = 1; i <= cart; i++) {		
			System.out.println("-----------------------------------------------");
		System.out.print("Enter the item name: ");
		String Item_name = op.nextLine();
		op.nextLine();
		System.out.println();
		
		System.out.print("Enter the cost of the item: ");
		double Item_prize = op.nextDouble();
		System.out.println();
		
		System.out.print("Enter the no of items: ");
		int no_of_items = op.nextInt();
		System.out.println();
		double total =0;
		
		if(no_of_items > 1) {
			total = Item_prize * no_of_items;
			System.out.println(no_of_items+" * "+Item_prize+" = "+total );
			
		}
		System.out.println();
		Shopping_bill_total += total;
		
	}
		System.out.println("Total bill amount: "+Shopping_bill_total);
	}

}
