package org.example;

public class Line {
    private int blockNum;
    private int whitespaceNum;
    private char blockType;

    public String toString() {
        String space = "";
        for (int i = 0; i < whitespaceNum / 2; i++) {
            space += " ";
        }
        String blockPack = "";
        for (int i = 0; i < blockNum; i++) {
            blockPack += blockType;
        }
        return (space + blockPack + space);
    }


    public Line(int blockNum, int whitespaceNum, char blockType) {
        this.blockNum = blockNum;
        this.whitespaceNum = whitespaceNum;
        this.blockType = blockType;
    }
}
