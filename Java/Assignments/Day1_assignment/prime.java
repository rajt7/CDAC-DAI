package Day1_assignment;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num:");
		num = sc.nextInt();
		int a=0;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				a++;
				break;
			}	
		}
		if(a==0)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
		
	}

}
