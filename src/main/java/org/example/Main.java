package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter shape's array size");
        Shape[] shapes = new Shape[scan.nextInt()];
        Factory factory = new Factory();
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Please enter shape[" + i + "] type:");
            shapes[i] = factory.getShape(scan.next());
        }
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
