package org.example.bankaccount;

import java.util.Scanner;

public class BankAccountConsoleApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sign in. Enter your username or ID - e.g.: user@bank.com / QPA220");

        String username = scanner.nextLine();
        System.out.println("Welcome " + username + " Enter your password.");

        scanner.nextLine();
        System.out.println("Welcome " + username + " in BankAccountConsoleApp");
        System.out.println();

        {
            System.out.print("Select options:\n1 = First\n2 = Second\n3 = End Program\n>> ");
        }

        {
            int numberOfOption;

            do {
                showMenu();
                numberOfOption = scanner.nextInt();
                switch (numberOfOption) {
                    case 1:
                        firstOption();
                        break;
                    case 2:
                        secondOption();
                        break;
                }
            }
            while (numberOfOption != 3);
            System.out.println("The third option has been selected. Program ends.");
        }

      }

    private static void showMenu() {
    }

    private static void firstOption() {
    }

    private static void secondOption() {
    }
}