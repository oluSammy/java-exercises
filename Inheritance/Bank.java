package Inheritance;

class BankAccount {
    int balance = 10000;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    int withdraw(int amount) throws Exception {
        if (balance >= amount) {
            this.balance -= amount;
            return balance;
        } else {
            System.out.println("Insufficient balance");
            throw new Exception("Insufficient balance");
        }
    }
}

public class Bank {
    public static void main(String args[]) {
        SavingsAccount savingsAccount = new SavingsAccount();
        try {
            savingsAccount.withdraw(300);
            savingsAccount.withdraw(300);
            int balance = savingsAccount.withdraw(300);
            System.out.println("Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
