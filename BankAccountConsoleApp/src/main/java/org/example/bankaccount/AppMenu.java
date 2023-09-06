package org.example.bankaccount;

import java.util.Scanner;

public class AppMenu {

    Scanner scanner = new Scanner(System.in);

    void firstOption() {
        System.out.println("The first option has been selected.");
    }

    void secondOption() {
        System.out.println("The second option has been selected");
    }

    void showMenu() {
        System.out.print("Select options:\n1. First\n2. Second\n3. End\n>> ");
    }

    void menu() {
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
    }
}
