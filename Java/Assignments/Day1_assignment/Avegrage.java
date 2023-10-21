package Day1_assignment;

import java.util.Scanner;

public class Avegrage {

	public static void main(String[] args) {
		int a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		float avg = (a+b+c+d+e)/5.0f;
		
		System.out.println("Average="+avg);

	}

}
