package com.liul85.learn;

import junit.framework.TestCase;

/**
 * Created by twcn on 3/5/16.
 */
public class CharacterTest extends TestCase {
    public void testWhitespace() throws Exception {
        assertTrue(Character.isWhitespace('\r'));
        assertTrue(Character.isWhitespace('\n'));
        assertTrue(Character.isWhitespace('\t'));
        assertTrue(Character.isWhitespace(' '));
        assertFalse(Character.isWhitespace('t'));
    }
}
