package com.liul85.learn;

import com.liul85.util.StringUtil;

/**
 * Created by twcn on 3/2/16.
 */
public class Piece {

    private String color;
    private String name;
    private static int whiteNumber = 0;
    private static int blackNumber = 0;

    private Piece(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static Piece create(String name, String color) {
        if (color.equals("white")) {
            whiteNumber += 1;
        } else if (color.equals("black")) {
            blackNumber += 1;
        }
        return new Piece(name, color);
    }

    public static int getNumber(String color) {
        if (color.equals("white")) {
            return whiteNumber;
        } else if (color.equals("black")) {
            return blackNumber;
        }
        return 0;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isWhite() {
        return color.equals("white");
    }

    public boolean isBlack() {
        return color.equals("black");
    }

}
