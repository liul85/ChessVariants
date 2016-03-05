package com.liul85.learn;

/**
 * Created by twcn on 3/2/16.
 */
public class PawnTest extends junit.framework.TestCase {

    private static final String white = "white";
    private Pawn whitePawn;
    private static final String black = "black";
    private Pawn blackPawn;

    @Override
    public void setUp() throws Exception {
        whitePawn = new Pawn(white);
        blackPawn = new Pawn(black);
    }

    public void testPawnColor() throws Exception {
        assertEquals(white, whitePawn.getColor());
        assertEquals(black, blackPawn.getColor());
    }

    public void testDefaultColor() throws Exception {
        Pawn pawn = new Pawn();
        assertEquals("white", pawn.getColor());
    }

    public void testPrintFormat() throws Exception {
        assertEquals("P", blackPawn.toString());
        assertEquals("p", whitePawn.toString());
    }
}
