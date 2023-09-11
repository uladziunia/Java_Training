package org.example.bankaccount;

import java.util.Scanner;

public class BankAccountConsoleApp<login> {

    public static void main(String[] args) throws InterruptedException {

//Let's prepare our one-user database ;)
        UserAccount userAccountDetails = new UserAccount();

//        User currentUser = new User;//("Krzysztof", "Kolumb", 01);
        System.out.println("Welcome to SuperCredit Bank Application.");
        System.out.println("Please sign in. Enter your credentials.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (!userAccountDetails.checkCredentials(login, password)) {
            userAccountDetails.setUnsuccesfullLogin();
            System.out.println("Authentication failed ! Exiting ...");
        } else {
            System.out.println("Welcome to SuperCredit Bank.");
            System.out.println("Hello "+userAccountDetails.getUserInfo(login));
            userAccountDetails.setSuccesfullLogin();

//        System.out.println(userAccountDetails.userName);

            {
                System.out.print("Select options:\n1 = First\n2 = Second\n3 = End Program\n>> ");
            }
            {
                System.out.println("On your profile you can: View/Edit/Close details");
            }

//        try {
//            login.equals(currentUser.getLogin());
//            System.out.println("Your login is correct");
//        } catch (Exception e) {
//            System.out.println("Your login is not correct");
//        }
//        try {
//            password.equals(currentUser.getPassword());
//            System.out.println("Your password is correct");
//        } catch (Exception e) {
//            System.out.println("Your password is not correct");
//        }

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
            System.out.println("The third option has been selected. Exiting...");
        }
    }

    private static void accountDetails() {
    }

    private static void showMenu() {
    }

    private static void firstOption() {
    }

    private static void secondOption() {
    }

    private static class Login {
    }
}