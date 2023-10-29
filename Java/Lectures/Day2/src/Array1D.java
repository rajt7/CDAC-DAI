import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 4, 5};       				     // initialized 1D array
		int [] b = new int[]{11, 12, 13, 14, 15, 16};        // initialized 1D array
		int [] c = new int[7];								 // uninitialized 1D array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<7; i++) {
			c[i] = sc.nextInt();
		}
		
		System.out.println("Array - ");
		for(int i=0; i<7; i++) {
			System.out.print(c[i] + " ");
		}
		
		// for each loop in java
		System.out.println();
		for(int val:c) {
			System.out.print(val + " ");
		}
        
        sc.close();
	}

}
