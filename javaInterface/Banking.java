package javaInterface;
import java.util.HashMap;


interface Account {
    double deposit(double amount, int accountNumber);
    double withdraw(double amount, int accountNumber);
    void calculateInterest();
}

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
}

class Bank {
    HashMap<String, BankAccount> bankAccounts;

    Bank(int accountNumber) {
        this.bankAccounts = new HashMap<>();
    }

    public void addAccount(int accountNumber, double balance) {
        bankAccounts.put(String.valueOf(accountNumber), new BankAccount(accountNumber));
    }

    public BankAccount getAccountNumber(int accountNumber) {
        return bankAccounts.get(String.valueOf(accountNumber));
    }

    public double deposit(double amount, int accountNumber) {
        BankAccount bankAccount = this.getAccountNumber(accountNumber);
        bankAccount.balance += amount;

        return bankAccount.balance;
    }

    public double withdraw(double amount, int accountNumber) {
        BankAccount bankAccount = this.getAccountNumber(accountNumber);
        bankAccount.balance -= amount;
        return bankAccount.balance;
    }
}

class SavingsAccount implements Account {
    int accountNumber;
    double balance;
    Bank bank;

    SavingsAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;

        this.bank = new Bank(accountNumber);
        this.bank.addAccount(accountNumber, balance);
    }

    public double deposit(double amount, int accountNumber) {
        System.out.println("Depositing " + amount + " to savings account " + accountNumber);
        return this.bank.deposit(amount, accountNumber);
    }

    public double withdraw(double amount, int accountNumber) {
        System.out.println("Withdrawing " + amount + " from savings account " + accountNumber);
        return this.bank.withdraw(amount, accountNumber);
    }

    public void calculateInterest() {
        System.out.println("Calculating interest for savings account " + accountNumber);
    }

    public double getBalance(int accountNumber) {
        System.out.println("Getting balance for savings account " + accountNumber);
        return this.bank.getAccountNumber(accountNumber).balance;
    }
}
// class CurrentAccount implements Account {}

public class Banking {
    public static void main(String args[]) {
        int savingsAccountNumber = 123456;
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber);
        savingsAccount.deposit(1000, savingsAccountNumber);
        savingsAccount.withdraw(500, savingsAccountNumber);
        savingsAccount.calculateInterest();
        savingsAccount.getBalance(savingsAccountNumber);
    }
}
