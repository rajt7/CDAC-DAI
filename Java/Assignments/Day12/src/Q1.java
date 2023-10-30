import java.io.*;
import java.util.*;

class Account implements Serializable{
    private int number;
    private String name;
    private double balance;

    public Account(int num, String name, double balance){
        this.number = num;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", name=" + name + ", balance=" + balance + "]";
    }
}

public class Q1 {

    public static void add_record_to_binary_file(int accNo, String name, double balance, File file){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Account(accNo, name, balance));
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void display_records(File file){
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // creating a arraylist of account to store all the account objects.
            ArrayList<Account> accountsData = new ArrayList<>();

            // Reading the object until EOF and adding it to array list.
            try{
                for(;;){
                    accountsData.add((Account)ois.readObject());
                }
            } catch(EOFException e){
                e.printStackTrace();
            }

            for(Account account: accountsData)
                System.out.println(account);

            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        System.out.println("Menu:\n" + 
                        "1. Accept a record of an account holder and save it into the binary file.\n" + 
                        "2. Display all records of account holder\n" + 
                        "3. Deposit an aamount into particular account of existing records and update the binary file.\n" + 
                        "4. Withdraw an amount from particular account of existing records and update the binary file.\n" + 
                        "5. Display account details of account holders having balance less than Rs 20000/-.\n" + 
                        "6. Exit\n");

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        File file  = new File("account_data.dat");

        while (choice != 6){
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    int num;
                    String name;
                    double balance;
                    System.out.println("Enter account number: ");
                    num = sc.nextInt();
                    System.out.println("Enter name: ");
                    name = sc.next();
                    System.out.println("Enter account balance: ");
                    balance = sc.nextDouble();
                    add_record_to_binary_file(num, name, balance, file);
                    System.out.println("Account created...");
                    break;
                case 2:
                    display_records(file);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice....");
            }
        }

    }
}
