package org.example.bankaccount;

import java.io.Console;
import java.util.Scanner;

public class BankAccountConsoleApp {

    static Scanner scanner = new Scanner(System.in);
    static boolean loggedIn = false;
    static int loggedUserIdx = -1;

    public static void main(String[] args) {
//      Let's prepare our two-users "database" ;)
        UserAccounts.initUsersPseudoDB();

        System.out.println("********************************************");
        System.out.println("* Welcome to SuperCredit Bank Application. *");
        System.out.println("********************************************");

        int menuSelector;
        mainLoop:
        do {
            showMenu();
            menuSelector = scanner.nextInt();
            scanner.nextLine();
            if (!loggedIn) {
                switch (menuSelector) {
                    case 1:
                        loggedIn = loginProcedure();
                        break;
                    case 2:
                        forgotPassword();
                        break;
                    case 3:
                        break mainLoop;
                }
            } else {
                switch (menuSelector) {
                    case 1:
                        userAccountDetails();
                        break;
                    case 2:
                        accountBalance();
                        break;
                    case 3:
                        changePassword();
                        break;
                    case 4:
                        loggedIn = logoutProcedure();
                        break;
                }
            }
        }
        while (true);

        System.out.println("******************************************************");
        System.out.println("* You have exited from SuperCredit Bank Application. *");
        System.out.println("******************************************************");
    }

    private static void showMenu() {
        if (loggedIn) {
            System.out.print("Select options:\n1 = userAccountDetails\n2 = accountBalance\n3 = changePassword\n4 = logout\n>>");
        } else {
            System.out.print("Select options:\n1 = Login to your account\n2 = Forgot your password?\n3 = Exit\n>>");
        }
    }

    public static boolean loginProcedure() {
        System.out.println("Please sign in. Enter your credentials.");
        Console console = System.console();
        String login;
        String password;
        if (console == null) {
            System.out.print("Enter username: ");
            login = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } else {
            login = console.readLine("Enter username: ");
            password = new String(console.readPassword("Enter password: "));
        }

        if (!UserAccounts.proceedLoginWithCredentials(login, password)) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("! Authentication failed! !");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            loggedUserIdx = -1;
            return false;
        } else {
            System.out.println("Hello " + UserAccounts.getUserInfo(login));
            loggedUserIdx = UserAccounts.getUserIndex(login);
            return true;
        }
    }
/*
        if (!userAccountDetails.checkCredentials(login, password)) {
            userAccountDetails.setUnsuccessfulLoginDateTime();
            System.out.println("Authentication failed!");
            return false;
        } else {
            userAccountDetails.setSuccessfulLoginDateTime();
            System.out.println("Hello " + userAccountDetails.getUserInfo(login));
            return true;
        }
 */

    public static boolean logoutProcedure() {
        System.out.println("#####################################");
        System.out.println("# You have logged out successfully. #");
        System.out.println("#####################################");
        loggedUserIdx = -1;
        return false;
    }

    private static void forgotPassword() {
        System.out.print("Enter username: ");
        String login = scanner.nextLine();
    }

    private static void changePassword() {
        System.out.print("Enter current password: ");
        String password = scanner.nextLine();
        if (UserAccounts.checkCredentials(UserAccounts.getUserLogin(loggedUserIdx), password)) {
            System.out.print("Enter new password: ");
            String password1 = scanner.nextLine();
            System.out.print("Repeat new password: ");
            String password2 = scanner.nextLine();
            if (!password1.equals(password2)) {
                System.out.println("The passwords do not match.");
            } else {
                if (password.equals(password2)) {
                    System.out.println("New password should be different than old one.");
                } else {
                    UserAccounts.setUserPassword(loggedUserIdx, password1);
                    System.out.println("***********************************");
                    System.out.println("* Your password has been changed. *");
                    System.out.println("***********************************");
                }
            }
        } else {
            System.out.println("You have entered wrong password!");
        }
    }

    private static void accountBalance() {
    }

    private static void userAccountDetails() {
    }
}