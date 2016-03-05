package com.liul85.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by twcn on 3/4/16.
 */
public class Board {
    private static Map<Integer, ArrayList<Object>> board = new HashMap<>();


    public Board() {
        ArrayList pawnsOfLine2 = new ArrayList<>();
        ArrayList pawnsOfLine7 = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            pawnsOfLine2.add(new Pawn("white"));
        }

        for (int j = 0; j < 8; j++) {
            pawnsOfLine7.add(new Pawn("black"));
        }

        for (int i = 1; i<9; i++) {
            board.put(i, new ArrayList<>(Arrays.asList(".", ".", ".", ".", ".", ".", ".", ".")));
        }

        board.put(2, pawnsOfLine2);
        board.put(7, pawnsOfLine7);
    }

    public int getNumberOfPawn() {
        int number = 0;
        for (ArrayList a : board.values()) {
            for (Object o : a) {
                if (o.getClass().equals(Pawn.class)) {
                    number++;
                }
            }
        }
        return number;
    }


    public String getPrintLine(int line) {
        StringBuilder builder = new StringBuilder();
        for (Object o : board.get(line)) {
            builder.append(o.toString());
        }
        return builder.toString();
    }

    public String getDisplay() {
        StringBuilder builder = new StringBuilder();
        for (ArrayList arraylist : board.values()) {
            builder.append("\n");
            for (Object o : arraylist) {
                builder.append(o.toString());
            }
        }
        return builder.reverse().toString();
    }
}
