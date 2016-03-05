package com.liul85.learn;

/**
 * Created by twcn on 3/2/16.
 */
public class Pawn {

    private final String black = "black";
    private final String white = "white";

    private String color;

    public Pawn(String color) {
        this.color = color;
    }

    public Pawn() {
        this.color = white;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (color == black) {
            return "P";
        } else {
            return "p";
        }
    }
}
