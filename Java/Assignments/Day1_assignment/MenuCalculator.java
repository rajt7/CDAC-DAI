package Day1_assignment;
import java.util.Scanner;
public class MenuCalculator {

	public static void main(String[] args) {
		System.out.println("Menu:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nChoice: ");
		Scanner input = new Scanner(System.in);
		int choice, a ,b;
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter two numbers: ");
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("Addition = "+ (a+b));
			break;
		case 2:
			System.out.println("Enter two numbers: ");
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("Subtraction = "+ (a-b));
			break;
		case 3:
			System.out.println("Enter two numbers: ");
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("Multiplication = "+ (a*b));
			break;
		case 4:
			System.out.println("Enter two numbers: ");
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("Division = "+ (a/b));
			break;
		default:
			System.out.println("Enter valid choice...");
		}
	}

}
