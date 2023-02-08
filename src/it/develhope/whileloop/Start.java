package it.develhope.whileloop;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------------Starting------------------");

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Hello there! Please, enter a command: ");
        do {input = scanner.nextLine();
            System.out.printf("You typed %s %n", input);
        } while (!input.equals("stop"));
    }
}
