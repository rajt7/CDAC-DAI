package Day1_assignment;
import java.util.Scanner;
public class NetSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float base_salary, hra, da, pf;
		System.out.println("Enter the net salary: ");
		base_salary = input.nextFloat();
		hra = base_salary*0.15f;
		da = base_salary*0.3f;
		pf = base_salary * 0.125f;
		System.out.println("The net salary is: $"+ (base_salary + hra + da - pf));
	}

}
