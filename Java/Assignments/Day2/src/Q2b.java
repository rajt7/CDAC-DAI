import java.util.Scanner;

public class Q2b {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] d = new int[3][3];
		int [][] e = new int[3][3];
		System.out.println("Enter elements of matrix1:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				d[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of matrix2:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				e[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) {
				System.out.print(d[i][j]+e[i][j]);
			}
			System.out.println();
		}
	}
}
