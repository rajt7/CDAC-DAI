import java.util.Scanner;

public class Q2a {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][]d = new int[3][3];
        int [][]e = new int[3][3];
        System.out.println("Matrix elements: ");
        for(int i=0;i<d.length;i++) {
            for(int j=0;j<d[i].length;j++) {
                d[i][j] = sc.nextInt();
                e[j][i] = d[i][j];
            }
        }
        
        for(int i=0;i<d.length;i++) {
            for(int j=0;j<d[i].length;j++) {
                
                System.out.print(e[i][j]);
            }
            System.out.println();
        }
    }
}
