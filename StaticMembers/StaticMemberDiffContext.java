package StaticMembers;

class BankAccount {
    private int accountNumber;
    private double balance;

    static double bankRate;
    static String bankName;

    BankAccount(int acctNo, double balance) {
        accountNumber = acctNo;
        this.balance = balance;
    }

    public int getAcctNo() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAcctNo(int acctNo) {
        accountNumber = acctNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class StaticMemberDiffContext {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100, 1000);
        BankAccount ba2 = new BankAccount(200, 2000);

        ba1.setAcctNo(100);
        ba2.setAcctNo(200);

        ba1.setBalance(1000);
        ba2.setBalance(2000);

        System.out.println("Account Number: " + ba1.getAcctNo());
        System.out.println("Balance: " + ba1.getBalance());
        System.out.println("Balance: " + ba2.getBalance());
    }
}
