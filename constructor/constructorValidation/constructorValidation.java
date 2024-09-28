package constructor.constructorValidation;

class Account {
    String accountNumber;
    int balance;

    Account(String accountNumber, int balance) {

        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Account number cannot be null or empty");
            return;
        }

        if (balance < 0) {
            System.out.println("Balance cannot be negative");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class constructorValidation {
    public static void main(String[] args) {
        Account acct = new Account("", 1000);
        System.out.println(acct.accountNumber);
        System.out.println(acct.balance);
    }
}
