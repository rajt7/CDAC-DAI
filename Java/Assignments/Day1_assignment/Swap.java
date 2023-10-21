package Day1_assignment;
import java.util.*;
public class Swap {
	public static void main(String [] arg) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x : ");
		x = sc.nextInt();
		System.out.println("Enter the y : ");
		y = sc.nextInt();
		z = x;
		x = y;
		y = z;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
	

}
