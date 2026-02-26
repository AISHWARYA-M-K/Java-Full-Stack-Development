package Task_01;

public class BankingSystem {
	
	public static void main(String []args) {
	
	String account_holder = "amar";
	long account_no = 2842394;
	double balance = 90000.25;
	boolean Active = true;
	
	if (balance >= 500){
		System.out.println(Active);
	}else {
		System.out.println(!Active);
	}
	
	}
	
}
