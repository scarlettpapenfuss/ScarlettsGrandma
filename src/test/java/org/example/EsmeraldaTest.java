package org.example;

import junit.framework.TestCase;

public class EsmeraldaTest extends TestCase {

    public void testLikesWord() {
        Esmeralda e = new Esmeralda();
        assertTrue(e.likesWord("contributory"));
        assertFalse(e.likesWord("hey"));
        assertFalse(e.likesWord(""));
    }
}