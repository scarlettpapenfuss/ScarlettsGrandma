package org.example;

import junit.framework.TestCase;

public class BettyTest extends TestCase {

        public void testLikesWord(){
            Anabelle b = new Anabelle();
            assertTrue(b.likesWord("sunny"));
            assertFalse(b.likesWord("eat"));
            assertFalse(b.likesWord(""));
        }

}