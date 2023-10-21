package Day1_assignment;
import java.util.Scanner;
public class conditional {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		if(x>y && x>z)
			System.out.println("X is greater");
		else if(x>y && x<z)
			System.out.println("Z is greater");
		else if(y>x && y>z)
			System.out.println("Y is greater");
		else if(y>x && y<z)
			System.out.println("Z is greater");
	}

}
