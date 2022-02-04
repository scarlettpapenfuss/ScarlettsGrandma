package org.example;

import junit.framework.TestCase;

public class SarahTest extends TestCase {

        public void testLikesWord(){
            Sarah s = new Sarah();
            assertTrue(s.likesWord("stop"));
            assertFalse(s.likesWord("never"));
        }

}