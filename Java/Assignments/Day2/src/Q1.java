import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size: ");
        int [] a = new int[sc.nextInt()];
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        
        int max, min;
        max = a[0];
        min = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i] > max)
                max=a[i];
            if(a[i] < min)
                min=a[i];
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);

        System.out.println("The new array is: ");
        int [] b = new int[a.length];
        for(int i=0; i<a.length; i++)
            b[i] = 5*a[i];
        
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        
    }
		
}
