package Task_02;
import java.util.Scanner;
public class Find_highest_number {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter any  two number to your liking");
        System.out.println("Enter 1st number: ");
        double n1 = op.nextDouble();
        System.out.println("Enter 2nd number: ");
        double n2 = op.nextDouble();
//        use if condition to check the interger
        if (n1 > n2){
            System.out.println("The number you entered 1st ( "+ n1 + " )is the highest");
        }else {
            System.out.println("The number you entered 2nd ( "+ n2 + " )is the highest");
        }
    }
}

