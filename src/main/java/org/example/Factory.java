package org.example;

import java.util.Scanner;

public class Factory {




    public Shape getShape(String shapeName) {
        Scanner scanner = new Scanner(System.in);
        switch (shapeName) {
            case ("Rectangle"):{
                System.out.println("Enter rectangle height:");
                int height = scanner.nextInt();
                System.out.println("Enter rectangle length:");
                int length = scanner.nextInt();
                System.out.println("Enter rectangle block:");
//                char block = scanner.next().charAt(0);
                String input = "";
                while (input.length() != 1) {
                    System.out.println("STUPID!!!");
                    input = scanner.next();
                }
                char block = input.charAt(0);
                return new Rectangle(height,length,block);
            }
            case("Pyramid"):{
                System.out.println("Enter Pyramid height:");
                int height = scanner.nextInt();
                System.out.println("Enter Pyramid block:");
                char block = scanner.next().charAt(0);
                return new Pyramid(height,block);
            }
            case("Square"):{
                System.out.println("Enter square size:");
                int size = scanner.nextInt();
                System.out.println("Enter square block:");
                char block = scanner.next().charAt(0);
                return new Square(size,block);
            }
            case("Rhombus"):{
                System.out.println("Enter rhombus size:");
                int size = scanner.nextInt();
                System.out.println("Enter rhombus block:");
                char block = scanner.next().charAt(0);
                return new Rhombus(size,block);
            }
            default:{
                System.out.println("Shape invalid. are u stupid?");
                return new Dot();
            }
        }
    }
}
