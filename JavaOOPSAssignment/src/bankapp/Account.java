package bankapp;

public class Account extends BankAccount implements Transaction {
    private double balance;
    
    // Final variable
    private final String BANK_NAME = "ABC Bank";
    
    // Static variable
    private static int accountCount = 0;

    public Account(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName);
        this.balance = balance;
        accountCount++;
    }

    // Encapsulation (getter & setter)
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Final method
    public final String getBankName() {
        return BANK_NAME;
    }

    // Static method
    public static int getAccountCount() {
        return accountCount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05; // 5% interest
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber +
               ", Holder: " + accountHolderName +
               ", Balance: " + balance;
    }
}
