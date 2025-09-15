package bankapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1: Add Account");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Display Account Details");
            System.out.println("5: Calculate Interest");
            System.out.println("6: Get Account Count");
            System.out.println("7: Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();
                    Account acc = new Account(accNo, name, balance);
                    accountManager.addAccount(acc);
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double dep = sc.nextDouble();
                    acc = accountManager.findAccount(accNo);
                    if (acc != null) acc.deposit(dep);
                    else System.out.println("Account not found!");
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double wd = sc.nextDouble();
                    acc = accountManager.findAccount(accNo);
                    if (acc != null) acc.withdraw(wd);
                    else System.out.println("Account not found!");
                    break;

                case 4:
                    accountManager.displayAllAccounts();
                    break;

                case 5:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();
                    acc = accountManager.findAccount(accNo);
                    if (acc != null)
                        System.out.println("Interest: " + acc.calculateInterest());
                    else
                        System.out.println("Account not found!");
                    break;

                case 6:
                    System.out.println("Total Accounts: " + Account.getAccountCount());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 7);

        sc.close();
    }
}
