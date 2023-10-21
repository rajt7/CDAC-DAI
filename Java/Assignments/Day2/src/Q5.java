import java.util.*;
public class Q5 {

    private long account_no;
    private String account_holder_name;
    private int account_balance;


    public Q5(long account_no, String account_holder_name, int account_balance) {
        this.account_no = account_no;
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    }


    public long getAccount_no() {
        return account_no;
    }


    public String getAccount_holder_name() {
        return account_holder_name;
    }


    public int getAccount_balance() {
        return account_balance;
    }


    public void setAccount_no(long account_no) {
        this.account_no = account_no;
    }


    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }


    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public  void deposit(int amount){
          this.account_balance = this.account_balance+amount;
          System.out.println("amount deposited successfully");
    }

    public void withdraw(int amount){
        this.account_balance = this.account_balance-amount;
        System.out.println("amount withdrawn successfully");
    }


    @Override
    public String toString() {
        return "AccountHolder [account_no=" + account_no + ", account_holder_name=" + account_holder_name
                + ", account_balance=" + account_balance + "]";
    }

    

}

class Tester{

    public static void main(String[] args){

        int no_of_account_created = 0;
        Q5[] accountHolders = new Q5[10];

        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n!=5) {
            
            System.out.println("\n1.Add record for account holder\n2.Display details of all account holders\n3.Deposite an amount into perticular account\n4.withdraw an amount from perticular amount\nEnter your choice: ");
            n = sc.nextInt();
            switch (n) {
                case 1:

                    System.out.println("enter account number");
                    long accno = sc.nextLong();
                    System.out.println("enter account holder name");
                    String holdername = sc.next();
                    System.out.println("enter account balance");
                    int accbalance = sc.nextInt();
                    accountHolders[no_of_account_created] = new Q5(accno,holdername,accbalance);
                    no_of_account_created++;
                    break;

                case 2:

                    if(accountHolders.length==0){
                        System.out.println("no record created.pls create a record for account holder first");
                    }else{
                        for(int i = 0;i<accountHolders.length;i++){
                            System.out.println(accountHolders[i]);
                            break;
                        }
                    }
                    break;

                case 3:

                    System.out.println("please enter account number");
                    long accountno = sc.nextLong();

                    for(int i = 0;i<accountHolders.length;i++){
                        
                        if(accountHolders[i]!=null && accountHolders[i].getAccount_no() == accountno){
                            System.out.println("please enter amount to be deposited");
                            int amt = sc.nextInt();
                            accountHolders[i].deposit(amt);
                            break;
                        }
                        if(i==accountHolders.length-1){
                            System.out.println("please enter valid account number");
                        }
                    }

                    break;
                   
                case 4:
                    System.out.println("please enter account number");
                    long accountno1 = sc.nextLong();

                    for(int i = 0;i<accountHolders.length;i++){
                        if(accountHolders[i]!=null && accountHolders[i].getAccount_no() == accountno1){
                            System.out.println("please enter amount to be withdrawn");
                            int amt = sc.nextInt();
                            accountHolders[i].withdraw(amt);
                            break;
                        }
                        if(i==accountHolders.length-1){
                            System.out.println("please enter valid account number");
                        }
                    }

                    break;

                default:
                    break;
            }
            if (n==5) {
                break;
            }
        }
    }

  
}
