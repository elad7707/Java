package org.example;

public class Pyramid implements Shape{
    private Line[] lineArray;

    public Pyramid(int radius, char block) {
        this.lineArray = new Line[radius];
        for (int i = lineArray.length - 1; i >= 0; i--) {
            int blockNum = 2 * i + 1;
            this.lineArray[i] = new Line(blockNum, (radius * 2 - 1) - blockNum, block);
        }
    }

    public String toString() {
        String shape = lineArray[lineArray.length - 1].toString();
        for (int i = lineArray.length - 2; i >= 0; i--) {
            shape = lineArray[i] + "\n" + shape;
        }
        return shape;
    }

    public void draw() {
        System.out.println(toString());
    }
}
