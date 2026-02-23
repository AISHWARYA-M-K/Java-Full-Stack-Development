package task_01;
import java.util.Scanner;
public class EmployeePayRoll {
	public static void main(String []arg) {
		Scanner Output = new Scanner(System.in);
		
		System.out.println("Enter the Employee name: ");
		String employee_name = Output.nextLine();
		
		System.out.println("Enter the Employee ID: ");
		int employee_Id = Output.nextInt();
		
		
		System.out.println("Enter the Basic Salary: ");
		double Salary = Output.nextDouble();
		
		float bonus = 1234f;
		
		double Total = Salary + bonus;
		
		System.out.println("The total salary of "+employee_name+" is "+Total);
		
		
		
	}

}
