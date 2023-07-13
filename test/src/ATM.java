import java.util.Scanner;

public class ATM {
    private Account account;
    private Customer customer;
    private Scanner scanner;

    public ATM() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("========== ATM ==========");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Transaction History");
            System.out.println("7. Exit");
            System.out.println("=========================");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    checkBalance();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    viewTransactionHistory();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using the ATM. Goodbye!");
    }

    private void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        account = new Account(accountNumber);
        System.out.println("Account created successfully.");
    }

    private void checkBalance() {
        if (account != null) {
            System.out.println("Account Balance: " + account.getBalance());
        } else {
            System.out.println("No account found. Please create an account first.");
        }
    }

    private void depositMoney() {
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            account.deposit(amount);
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("No account found. Please create an account first.");
        }
    }

    private void withdrawMoney() {
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            account.withdraw(amount);
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("No account found. Please create an account first.");
        }
    }

    private void viewTransactionHistory() {
        if (account != null) {
            account.printTransactionHistory();
        } else {
            System.out.println("No account found. Please create an account first.");
        }
    }

}