package Day1_assignment;

import java.util.Scanner;

public class SalAndCommision {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float base_salary, sales;
		System.out.println("Enter the net salary: ");
		base_salary = input.nextFloat();
		System.out.println("Enter the total sales amount for a salesperson: ");
		sales = input.nextFloat();
		
		if (sales > 5000 && sales < 7500)
			System.out.println("The net salary is: $" + (base_salary + sales*0.03));
		else if (sales > 7501 && sales < 10500)
			System.out.println("The net salary is: $" + (base_salary + sales*0.08));
		else if (sales > 10501 && sales < 15000)
			System.out.println("The net salary is: $" + (base_salary + sales*0.11));
		else if (sales > 15000)
			System.out.println("The net salary is: $" + (base_salary + sales*0.15));
		
	}
}
