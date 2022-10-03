package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsTest {

    @Test
    void swapstest1(){
        MinimumSwaps obj=new MinimumSwaps();
        int expected=1;
        int actual=obj.minswap(new int[]{2, 8, 5, 4},4);
        assertEquals(expected,actual);
    }

    @Test
    void swapstest2(){
        MinimumSwaps obj=new MinimumSwaps();
        int expected=2;
        int actual=obj.minswap(new int[]{10, 19, 6, 3, 5},5);
        assertEquals(expected,actual);
    }

}