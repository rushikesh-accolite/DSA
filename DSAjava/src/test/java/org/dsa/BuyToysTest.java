package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyToysTest {

    @Test
    void toytest1() {
        BuyToys obj=new BuyToys();
        int expected=4;
        int output=obj.toys(new int[] {1, 12, 5, 111, 200, 1000, 10}
        ,7,50);
        assertEquals(expected,output);

    }

    @Test
    void toytest2() {
        BuyToys obj=new BuyToys();
        int expected=3;
        int output=obj.toys(new int[] {20, 30, 50}
                ,3,100);
        assertEquals(expected,output);

    }

}