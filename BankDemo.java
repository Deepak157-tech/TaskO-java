class BankAccount {

    private int balance = 5000;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance");
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.withdraw(6000);
    }
}
