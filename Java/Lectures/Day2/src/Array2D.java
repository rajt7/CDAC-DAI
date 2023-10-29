import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};              //initialized 2D Array
		int [][] b = {{1, 2, 3, 4, 5}, {4, 5}, {7, 8, 9}};           //Jagged Array
		int [][] c = new int[3][3];  								 //uninitialized 2D Array
		
		int [][] d = new int[3][];
		d[0] = new int[4];
		d[1] = new int[5];
		d[2] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array: ");
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int []temp: d) {
			for(int i: temp) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
