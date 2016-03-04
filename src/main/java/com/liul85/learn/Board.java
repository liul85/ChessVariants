package com.liul85.learn;

import java.util.ArrayList;

/**
 * Created by twcn on 3/4/16.
 */
public class Board {
    private ArrayList<Pawn> allPawns = new ArrayList<Pawn>();

    public int getNumberOfPawn() {
        return allPawns.size();
    }

    public void enroll(Pawn pawn) {
        allPawns.add(pawn);
    }

    public Pawn getPawn(int i) {
        return allPawns.get(i);
    }
}
