package bankapp;

import java.util.ArrayList;

public class AccountManager {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}
