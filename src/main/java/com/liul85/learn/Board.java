package com.liul85.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.liul85.learn.Piece.create;
import static com.liul85.learn.Piece.getNumber;

/**
 * Created by twcn on 3/4/16.
 */
public class Board {
    private static final String BLACK = "black";
    private static final String WHITE = "white";
    private static Map<Integer, ArrayList<Object>> board = new HashMap<>();

    public Board() {
        ArrayList pawnsOfLine1 = new ArrayList();
        ArrayList pawnsOfLine2 = new ArrayList();
        ArrayList pawnsOfLine7 = new ArrayList();
        ArrayList pawnsOfLine8 = new ArrayList();

        pawnsOfLine1.add(create("r", WHITE));
        pawnsOfLine1.add(create("n", WHITE));
        pawnsOfLine1.add(create("b", WHITE));
        pawnsOfLine1.add(create("k", WHITE));
        pawnsOfLine1.add(create("q", WHITE));
        pawnsOfLine1.add(create("b", WHITE));
        pawnsOfLine1.add(create("n", WHITE));
        pawnsOfLine1.add(create("r", WHITE));

        pawnsOfLine8.add(create("R", BLACK));
        pawnsOfLine8.add(create("N", BLACK));
        pawnsOfLine8.add(create("B", BLACK));
        pawnsOfLine8.add(create("K", BLACK));
        pawnsOfLine8.add(create("Q", BLACK));
        pawnsOfLine8.add(create("B", BLACK));
        pawnsOfLine8.add(create("N", BLACK));
        pawnsOfLine8.add(create("R", BLACK));


        for (int i = 0; i < 8; i++) {
            pawnsOfLine2.add(create("p", WHITE));
        }

        for (int j = 0; j < 8; j++) {
            pawnsOfLine7.add(create("P", BLACK));
        }

        for (int i = 1; i<9; i++) {
            board.put(i, new ArrayList<>(Arrays.asList(".", ".", ".", ".", ".", ".", ".", ".")));
        }

        board.put(1, pawnsOfLine1);
        board.put(2, pawnsOfLine2);
        board.put(7, pawnsOfLine7);
        board.put(8, pawnsOfLine8);
    }

    public int getNumberOfPawn() {
        return getNumber(WHITE) + getNumber(BLACK);
    }


    public String print() {
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
