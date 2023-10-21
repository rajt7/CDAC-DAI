package Day1_assignment;
import java.util.*;
public class swap_without {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		x = sc.nextInt();
		System.out.println("Enter y:");
		y = sc.nextInt();
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
