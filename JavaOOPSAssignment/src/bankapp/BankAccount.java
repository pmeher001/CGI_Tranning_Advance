package bankapp;

public abstract class BankAccount {
    protected int accountNumber;
    protected String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Abstract method
    public abstract double calculateInterest();
}
