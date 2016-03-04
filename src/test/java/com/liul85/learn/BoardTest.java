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
        assertEquals(0, board.getNumberOfPawn());
    }

    public void testAddPawnToBoard() throws Exception {
        Pawn pawn1 = new Pawn("black");
        Pawn pawn2 = new Pawn("white");
        board.enroll(pawn1);

        assertEquals(1, board.getNumberOfPawn());
        assertEquals(pawn1, board.getPawn(0));

        board.enroll(pawn2);
        assertEquals(2, board.getNumberOfPawn());
        assertEquals(pawn2, board.getPawn(1));
    }
}
