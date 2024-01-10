package org.example;

public class Square {
    private int size;
    private char block;
    public Square(int size, char block) {
        this.size = size;
        this.block = block;
    }
    public String toString(){
        String shape = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                shape += block;
            }
            shape += "\n";
        }
        return shape;
    }
    public void draw(){
        System.out.println(toString());
    }
}
