package it.develhope.whileloop;

/**
 * This is a Tester class
 * @author alessiolimina
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------------Starting------------------");

        /**
         * Declaring the variable input, typed from the user
         */

        Scanner scanner = new Scanner(System.in);
        String input;

        /**
         * Doing a DO/WHILE Loop to print the word typed by user
         * Stopping the loop if the typed word is "stop"
         */

        do {System.out.println("Hello there! Please, enter a command: ");
            input = scanner.nextLine();
            System.out.printf("You typed %s %n", input);
            System.out.println("-----------------------");
        } while (!input.equals("stop"));
    }
}
