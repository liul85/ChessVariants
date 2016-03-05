package com.liul85.learn;

/**
 * Created by twcn on 3/4/16.
 */
public class BoardTest extends junit.framework.TestCase {
    private Board board;

    @Override
    public void setUp() throws Exception {
        board = new Board();
    }

    public void testCreateBoard() throws Exception {
        assertEquals(16, board.getNumberOfPawn());
        assertEquals("pppppppp", board.getPrintLine(2));
        assertEquals("PPPPPPPP", board.getPrintLine(7));

        assertEquals("........\nPPPPPPPP\n........\n........\n........\n........\npppppppp\n........\n",
                board.getDisplay());
    }
}
