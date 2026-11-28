
class BankAccount {

    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Java_28_11_2026_Q2 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Madhav", 5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(7000);

        account.display();
    }
}
