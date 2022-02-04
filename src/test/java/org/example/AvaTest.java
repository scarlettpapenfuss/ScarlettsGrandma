package org.example;

import junit.framework.TestCase;

public class AvaTest extends TestCase {

        public void testLikesWord(){
            Ava a = new Ava();
            assertFalse(a.likesWord(""));
            assertTrue(a.likesWord("dog"));
            assertTrue(a.likesWord("car"));
        }
}