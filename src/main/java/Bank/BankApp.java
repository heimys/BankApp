package Bank;

import java.util.Scanner;

public class BankApp {
    public void initSession(String name, String account) {
        printWelcome(name, account);
        printMenu();
    }

    private void printMenu() {
        println(System.lineSeparator());
        println("********************");
        println("(W) Withdraw");
        println("(D) Deposit");
        println("(B) My Balance");
        println("(T) My Transactions");
        println("(E) Exit");
        println("********************");

        getClientChoice();
    }

    private void getClientChoice() {
        try (Scanner scanner = new Scanner(System.in)) {
            char option;
            do {
                System.out.print("Select an option: ");
                option = (char) scanner.nextLine().trim().toUpperCase().charAt(0);
                switch (option) {
                    case 'W':
                        withdraw();
                        break;
                    case 'D':
                        deposit();
                        break;
                    case 'B':
                        showBalance();
                        break;
                    case 'T':
                        showTransactions();
                        break;
                    case 'A':
                        printMenu();
                        break;
                    case 'E':
                        endSession();
                        break;
                    default:
                        println(option + " is an invalid option");
                        break;
                }
                println(System.lineSeparator());
                println("(A) Show All options");
            } while (option != 'E');
        }
    }

    private void endSession() {
        println("Exit...");
    }

    private void showTransactions() {
        println("My Transactions...");
    }

    private void showBalance() {
        println("My Balance...");
    }

    private void deposit() {
        println("Deposit...");
    }

    private void withdraw() {
        println("Withdraw...");
    }

    private void printWelcome(String name, String account) {
        println("Welcome " + name);
        println("Your current account is " + account);
    }
    
    private void println(String message){
        System.out.println(message);
    }
}
