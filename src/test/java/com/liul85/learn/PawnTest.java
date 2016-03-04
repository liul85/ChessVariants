package com.liul85.learn;

import com.liul85.learn.Pawn;

/**
 * Created by twcn on 3/2/16.
 */
public class PawnTest extends junit.framework.TestCase {
    public void testPawnColor() throws Exception {
        final String white = "white";
        Pawn pawn = new Pawn(white);
        assertEquals(white, pawn.getColor());


        final String black = "black";
        Pawn blackPawn = new Pawn(black);
        assertEquals(black, blackPawn.getColor());
    }

    public void testDefaultColor() throws Exception {
        Pawn pawn = new Pawn();
        assertEquals("white", pawn.getColor());
    }
}
