package com.liul85.learn;

import static com.liul85.learn.Piece.create;

/**
 * Created by twcn on 3/2/16.
 */
public class PieceTest extends junit.framework.TestCase {

    private static final String white = "white";
    private Piece whitePiece;
    private static final String black = "black";
    private Piece blackPiece;

    @Override
    public void setUp() throws Exception {
        whitePiece = create("p", white);
        blackPiece = create("P", black);
    }

    public void testPawnColor() throws Exception {
        assertEquals(white, whitePiece.getColor());
        assertEquals(black, blackPiece.getColor());
        assertTrue(whitePiece.isWhite());
        assertTrue(blackPiece.isBlack());
        assertFalse(blackPiece.isWhite());
    }

    public void testPrintFormat() throws Exception {
        assertEquals("P", blackPiece.toString());
        assertEquals("p", whitePiece.toString());
    }
}
