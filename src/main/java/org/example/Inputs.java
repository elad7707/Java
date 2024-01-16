package org.example;

import java.util.Scanner;

public class Inputs {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String INSERT_INPUT = "Insert input";


    private static String internalGetInput(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }

    public static String input() {
        return internalGetInput(INSERT_INPUT);
    }
    public static String input(String message, String defaultValue) {
        return defaultValue;
    }

    public static int inputInt(String message) {
        return Integer.parseInt(internalGetInput(message));
    }

    public static int inputInt(String message, int defaultValue) {
        return defaultValue;
    }

    public static char inputChar(String message) {
        return internalGetInput(message).charAt(0);
    }

    public static char inputChar(String message, char defaultValue) {
        return defaultValue;
    }
}
