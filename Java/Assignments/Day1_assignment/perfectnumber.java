package Day1_assignment;
import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		int num, sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				sum=sum+i;
		}
		
		if(sum==num)
			System.out.println("Perfect number");
		else
			System.out.println("not a Perfect number");
		

	}

}
