package org.example.bankaccount;

import java.util.Scanner;
import java.util.logging.Logger;

public class BankAccountConsoleApp {

//    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
//    CustomerRegistry customerRegistry = CustomerRegistry.getInstance();
//    var john = new Customer("1", "John");
//        customerRegistry.addCustomer(john);
//
//    var julia = new Customer("2", "Julia");
//        customerRegistry.addCustomer(julia);
//
//        LOGGER.info("John {}", customerRegistry.getCustomer("1"));
//        LOGGER.info("Julia {}", customerRegistry.getCustomer("2"));

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sign in. Enter your username - e.g.: user@bank.com");

        String username = scanner.nextLine();
        System.out.println("Welcome " + username + " Enter your password.");

        scanner.nextLine();
        System.out.println("Welcome " + username + " in BankAccountConsoleApp");

        //System.out.println("Welcome in Bank Account Console App");
        //Scanner scanner = new Scanner( System.in );

        {
            System.out.print( "Select options:\n1 = First\n2 = Second\n3 = End Program\n>> " );
        }

                {
            int numberOfOption;
            do
            {
                showMenu();
                numberOfOption = scanner.nextInt();
                switch( numberOfOption )
                {
                    case 1 : firstOption();
                        break;
                    case 2 : secondOption();
                        break;
                }
            }
            while(numberOfOption != 3 );
                    System.out.println( "The third option has been selected. Program ends." );
        }

}

    private static void secondOption() {
    }

    private static void firstOption() {
    }

    private static void showMenu() {
    }
}
