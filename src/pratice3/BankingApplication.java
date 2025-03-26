package pratice3;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect customer details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your customer ID: ");
        String id = sc.nextLine();

        // Create a BankAccount object
        BankAccount account = new BankAccount(name, id);
        account.showMenu();
    }
}

class BankAccount {
    private int balance = 1000;
    private int previousTransaction;
    private final String customerName;
    private final String customerId;

    // Constructor to initialize customer details
    public BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    // Method to deposit an amount
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(int amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                previousTransaction = -amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to show the previous transaction
    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred.");
        }
    }

    // Method to display the menu and handle user interaction
    public void showMenu() {
        char option;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID: " + customerId);
        System.out.println("\nMenu:");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("\n=====================");
            System.out.print("Enter an option: ");
            option = sc.next().toUpperCase().charAt(0);
            System.out.println("=====================\n");

            switch (option) {
                case 'A' -> {
                    System.out.println("Balance: " + balance);
                }
                case 'B' -> {
                    System.out.print("Enter an amount to deposit: ");
                    int amount = sc.nextInt();
                    deposit(amount);
                }
                case 'C' -> {
                    System.out.print("Enter an amount to withdraw: ");
                    int amount = sc.nextInt();
                    withdraw(amount);
                }
                case 'D' -> {
                    getPreviousTransaction();
                }
                case 'E' -> {
                    System.out.println("Thank you for using our banking services!");
                }
                default -> {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        } while (option != 'E');
    }
}