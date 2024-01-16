package org.example;

import java.util.Scanner;

public class Factory {


    public static Shape getShape(String shapeName) {
        Scanner scanner = new Scanner(System.in);
        switch (shapeName) {
            case ("Rectangle"): {
                int height = Utilities.getInteger("Enter rectangle height:");
                int length = Utilities.getInteger("Enter rectangle length:");
                char block = Utilities.getchar("Enter rectangle block:");
                return new Rectangle(height, length, block);
            }
            case ("Pyramid"): {
                int height = Utilities.getInteger("Enter Pyramid height:");
                char block = Utilities.getchar("Enter Pyramid block:");
                return new Pyramid(height, block);
            }
            case ("Square"): {
                int size = Utilities.getInteger("Enter square size:");
                char block = Utilities.getchar("Enter Square block:");
                return new Square(size, block);
            }
            case ("Rhombus"): {
                int size = Utilities.getInteger("Enter rhombus size:");
                char block = Utilities.getchar("Enter Rhombus block:");
                return new Rhombus(size, block);
            }
            default: {
                System.out.println("Shape invalid. are u stupid?");
                return new Dot();
            }
        }
    }
}