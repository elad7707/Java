package org.example;

import java.util.Date;
import java.util.Scanner;

public class Utilities {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static String getString(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }
    public static int getInteger(String message) {
        try {
            return Integer.parseInt(getString(message));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please try again:");
            return getInteger(message);
        }
    }

    public static char getchar(String message){
        while (true) {
            String input = getString(message);
            if(input.length() == 1)
                return input.charAt(0);
            System.out.println("Invalid Input. ARE U FUCKING DUMB!???");
        }
    }
}