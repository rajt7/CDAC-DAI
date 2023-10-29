package ExceptionHandling;

class OverLimit extends Exception{
    public OverLimit(String str) {
        super(str);
    }
}

class InsufficientBalance extends Exception {
    public InsufficientBalance(String str) {
        super(str);
    }
}

class Account{
    private int balance;

    public Account() {
        balance = 1000;
    }

    public Account(int initialBalance){
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void withdraw(int amount){
        try{
            if(amount > 15000){
                throw new OverLimit("You can not withdraw more than 15000 in a single withdrawal.");
            }
            else if (amount > this.getBalance()){
                throw new InsufficientBalance("Your balance is not sufficient to withdraw " + amount);
            }
            balance = balance - amount;
        } catch(OverLimit ol){
            System.out.println(ol.getMessage());
        } catch(InsufficientBalance ib){
            System.out.println(ib.getMessage());
        }
    }
}

public class Q1 {
    public static void main(String[] args){
        Account acc = new Account();
        acc.withdraw(12000);
        System.out.println("Accoutn Balance: " + acc.getBalance());
    }
}
