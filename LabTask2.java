class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class LabTask2 {

    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account(5000);

        a1.deposit(1000);
        System.out.println("Account 1 balance = " + a1.getBalance());

        a2.withdraw(500);
        System.out.println("Account 2 balance = " + a2.getBalance());
    }
}