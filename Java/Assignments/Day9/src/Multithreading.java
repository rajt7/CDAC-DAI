import java.util.Scanner;

class NumberPrinter extends Thread {
    private int num;

    public NumberPrinter(int userNum){
        this.num = userNum;
    }

    public void run() {
        System.out.println("Printing the next 10 incremented numbers: ");
        for(int i=num+1; i<=num+10; i++){
            System.out.println(num);
        }
    }
}

class TablePrinter extends Thread {
    private int num;

    public TablePrinter(int userNum){
        this.num = userNum;
    }

    public void run() {
        System.out.println("Printing the multiplication table: ");
        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + " = " + num * i);
        }
    }
}


public class Multithreading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userNumber;
        System.out.println("Enter the number: ");
        userNumber = sc.nextInt();

        NumberPrinter npt = new NumberPrinter(userNumber);
        TablePrinter tpt = new TablePrinter(userNumber);

        npt.start();
        tpt.start();

        sc.close();
    }
}
