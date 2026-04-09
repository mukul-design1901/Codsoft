package ATM;

import java.util.Scanner;

// Bank Account Class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Amount deposited successfully!");
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawal successful!");
        }
    }

    // Check Balance
    public double checkBalance() {
        return balance;
    }
}

// ATM Class
class ATM {
    private BankAccount account;

    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Display Menu
    public void displayMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    // Start ATM Interface
    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Current Balance: " + account.checkBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("🙏 Thank you for using ATM!");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
