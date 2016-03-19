package com.liul85.learn;

import com.liul85.util.StringUtil;

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
        assertEquals(32, board.getNumberOfPawn());
        assertEquals(16, Piece.getNumber("white"));
        assertEquals(16, Piece.getNumber("black"));

        String blankRank = StringUtil.appendNewLine("........");
        assertEquals(StringUtil.appendNewLine("RNBQKBNR") +
                StringUtil.appendNewLine("PPPPPPPP") +
                blankRank + blankRank + blankRank + blankRank +
        StringUtil.appendNewLine("pppppppp") +
        StringUtil.appendNewLine("rnbqkbnr"), board.print());
    }
}
