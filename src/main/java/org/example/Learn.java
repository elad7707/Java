package org.example;

import java.util.*;

public class Learn {

    public static final String SPACE = " ";
    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        Shape shape = new Pyramid(7,'#');
        shape.draw();
        Shape shape1 = new Rectangle(3,5,'#');
        shape1.draw();
//        Pyramid pyramid = new Pyramid(7,'#');
//        pyramid.draw();
////        String squareString = square.toString();
////        System.out.println(squareString);
////        Rectangle rectangle = new Rectangle(7,5,'#');
////        rectangle.draw();
////        String rectangleString = rectangle.toString();
////        System.out.println(rectangleString);
////        String numbers = "345";
////        numbers = "12" + numbers + "67";
////        System.out.println("numbers = " + numbers);
//
//        main();
    }

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


    private static void main() {
        int rowNum = inputInt("Please enter a row number:", scan, 7);
        char pyramidBlock = inputChar("Please enter a char:", scan, '\'');

        fifthSuccess(rowNum, pyramidBlock);
    }

    private static void firstSuccess(int rowNum, char pyramidBlock) {
        boolean done;
        for (int i = 0; i < rowNum; i++) {
            int num = i + 1;
            done = false;
            for (int j = 0; j < (num * 2 - 1); j++) {
                if (!done) {
                    int a = rowNum - num;
                    for (int k = 0; k < a; k++) {
                        System.out.print(" ");
                        done = true;
                    }
                }
                System.out.print(pyramidBlock);
            }
            System.out.println();
        }
    }

    private static void secondSuccess(int rowNum, char pyramidBlock) {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < (rowNum * 2 - 1); j++) {
                if (j < (rowNum - i - 1) || j > (rowNum + i - 1)) {
                    System.out.print(SPACE);
                } else {
                    System.out.print(pyramidBlock);
                }
            }
            System.out.println();
        }
        for (int i = rowNum - 2; i >= 0; i--) {
            for (int j = 0; j < (rowNum * 2 - 1); j++) {
                if (j < (rowNum - i - 1) || j > (rowNum + i - 1)) {
                    System.out.print(SPACE);
                } else {
                    System.out.print(pyramidBlock);
                }
            }
            System.out.println();
        }
    }

    private static void thirdSuccess(int rowNum, char pyramidBlock) {
        String shape = null;
        String line = "";
//        for (int i = 0; i < rowNum; i++) {
//            for (int j = 0; j < (rowNum * 2 - 1); j++) {
//                if (j < (rowNum - i - 1) || j > (rowNum + i - 1)) {
//                    shape += SPACE;
//                } else {
//                    shape += pyramidBlock;
//                }
//            }
//            shape += "\n";
//        }
        for (int i = rowNum - 1; i >= 0; i--) {
            int blockNum = 2 * i - 1;
            for (int j = 0; j < (rowNum * 2 - 1); j++) {
                if (j < (rowNum - i - 1) || j > (rowNum + i - 1)) {
                    line += SPACE;
                } else {
                    line += pyramidBlock;
                }
            }
            line = "|" + line + "|";
            line += "\n";
            if (shape == null) {
                shape = line;
            } else {
                shape = line + shape + line;
            }
            line = "";
            shape += line;
        }
        System.out.println(shape);
    }

    private static void forthSuccess(int rowNum, char pyramidBlock) {
//        List<String> strings = new ArrayList();
        String shape = null;
        String line = "";
        for (int i = rowNum - 1; i >= 0; i--) {
            for (int j = 0; j < (rowNum * 2 - 1); j++) {
                if (j < (rowNum - i - 1) || j > (rowNum + i - 1)) {
                    line += SPACE;
                } else {
                    line += pyramidBlock;
                }
            }
            line = "|" + line + "|";
            line += "\n";
            if (shape == null) {
                shape = line;
            } else {
                shape = line + shape + line;
            }
            line = "";
        }
        System.out.println(shape);
    }

    private static void fifthSuccess(int rowNum, char pyramidBlock) {
        Rhombus rhombus = new Rhombus(rowNum, pyramidBlock);
        rhombus.draw();
    }
}
