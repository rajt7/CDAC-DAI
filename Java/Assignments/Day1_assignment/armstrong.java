package Day1_assignment;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int pow1=0,num ;
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		int num1 = num;
		while(num1>0) {
			num1 = num1/10;
			pow1++;
		}
		num1 = num;
		while(num1>0) {
			int ld = num1%10;
			sum = sum + Math.pow(ld, pow1);
			num1 = num1/10;
		}

		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("not");


	}

}
