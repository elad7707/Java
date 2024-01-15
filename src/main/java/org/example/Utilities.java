package org.example;

import java.util.Scanner;

public class Utilities {
    private String get_string() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private boolean isStringInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    Integer number = Integer.valueOf(string);
}
