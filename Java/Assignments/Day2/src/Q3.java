import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
		int [][] d = new int[3][3];
		int [][] e = new int[3][3];
		int [][] f = new int[3][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				d[i][j] = sc.nextInt();
				e[j][i] = d[i][j];
			}
		}

		System.out.println("The array is: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<2; i++){
			for(int k=0; k<2; k++){
				int sum=0;
				for(int j=0; j<2; j++){
					sum = sum + (d[i][j] * e[k][j]);
				}
				f[i][k] = sum;
			}
		}

		System.out.println("The final array is: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(f[i][j] + " ");
			}
			System.out.println();
		}
		
	}
    
}
