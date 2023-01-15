package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveConsecutiveCharsTest {

    @Test
    void  testInputs(){
        assertEquals(RemoveConsecutiveChars.removeConsecutiveDuplicates("aabbcc"),"abc");
    }

    @Test
    void testRemovePairs(){
        assertEquals(RemoveConsecutiveChars.removePairOfDuplicates("aaabbaaccd"), "ad");
        assertEquals(RemoveConsecutiveChars.removePairOfDuplicates("aaaa"),"");
    }
}