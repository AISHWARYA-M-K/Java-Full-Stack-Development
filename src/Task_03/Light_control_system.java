package Task_03;
import java.util.Scanner;
public class Light_control_system {

	public static void main(String[] args) {
		Scanner op =new Scanner(System.in);
		System.out.println("LIGHT BULB");
		
		int light = 0;
		
		int Switch;
		
		Switch = light | 1;
		System.out.println("The light is on");
		
		Switch = light & 0;
		System.out.println("The light is off");
		
		Switch = light ^ 1;
		System.out.println("the light is :"+ Switch);
		
		
		


	}

}
