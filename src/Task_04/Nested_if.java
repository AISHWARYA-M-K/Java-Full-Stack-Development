package Task_04;
import java.util.Scanner;
public class Nested_if {

	public static void main(String[] args) {
		Scanner op =new Scanner(System.in);
		int a,b,c;
		int max =0;
		System.out.println("Enter the value of a: ");
		a = op.nextInt();
		System.out.println("Enter the value of b: ");
		b = op.nextInt();
		System.out.println("Enter the value of c: ");
		c = op.nextInt();
		
		if(a>b) {
			if(a>c) {
				max =a;
			}else {
				max =c;
			}
		}else {
			if(b>c) {
				max = b;
			}else {
				max =c;
			}
		}
		System.out.println("max value: "+ max);
	}
}
