package Task_01;

public class Type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Nirmaan");
		
//		--> WIDENING CASTING (INT TO DOUBLE)
		System.out.println("explicit casting babieeeeee!!!");
		System.out.println();
		System.out.println("WIDENING CASTING");
//		INT TO DOUBLE 
		int a = 10;
		double b = 5.567890;
		int c = (int) b;
		System.out.println("int to double: "+c);
		
//		BYTE TO SHORT
		byte aa = 12;
		short bb = (short) aa;
		System.out.println("byte to short: "+bb);
		
//		SHORT TO INT
		short ab = 4567;
		int bc = (int)ab;
		System.out.println("short to int: "+bc);
		
//		INT TO FLOAT
		int x = 890;
		float f = (float)x;
		System.out.println("int to float: "+f);
		
//		INT TO LONG
		int i1 = 9;
		long l1 = (long)i1;
		System.out.println("int to long: "+l1);
		
//		FLOAT TO DOUBLE
		float y = 45.89f;
		double d = (double) y;
		System.out.println("float to double: "+d);
		System.out.println();
		
//		--> NARROW CASTING
		System.out.println("NARROWING CASTING");
//		DOUBLE TO FLOAT
		double d1 = 45.9909898;
		float f1 = (float)d1;
		System.out.println("double to float: "+f1);
		
//		FLOAT TO LONG
		float f2 = 9.4564567890f;
		long l2 =(long)f2;
		System.out.println("float to long guyss: "+l2);
		
//	    LONG TO INT
		long L1 = 1234567890;
		int I1 = (int)L1;
		System.out.println("long to int: "+I1);
	}

}
