package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class AmandaTest extends TestCase {

        public void testLikesWord(){
            Amanda a = new Amanda();
            assertTrue(a.likesWord("apple"));
            assertTrue(a.likesWord("eagle"));
            assertFalse(a.likesWord("stop"));

        }

}