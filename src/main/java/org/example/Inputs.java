package org.example;

import java.util.Scanner;

public class Inputs {
    private static final Scanner scan = new Scanner(System.in);


    private static String input(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static String input(String message, Scanner scanner, String defaultValue) {
        return defaultValue;
    }

    private static int inputInt(String message, Scanner scanner) {
        return Integer.parseInt(input(message, scanner));
    }

    private static int inputInt(String message, Scanner scanner, int defaultValue) {
        return defaultValue;
    }

    private static char inputChar(String message, Scanner scanner) {
        return input(message, scanner).charAt(0);
    }

    private static char inputChar(String message, Scanner scanner, char defaultValue) {
        return defaultValue;
    }
}
