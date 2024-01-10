package org.example;

public class Rectangle implements Shape {
    private int height;
    private int length;
    private char block;

    public Rectangle(int height, int length, char block) {
        this.height = height;
        this.length = length;
        this.block = block;
    }

    public String toString() {
        String shape = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                shape += block;
            }
            shape += "\n";
        }
        return shape;
    }

    public void draw() {
        System.out.println(toString());
    }
}
