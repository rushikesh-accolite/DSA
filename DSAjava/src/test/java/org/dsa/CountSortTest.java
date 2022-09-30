package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountSortTest {

    @Test
    void countsorttest1(){
        CountSort obj=new CountSort();
        List<Integer>expected=new ArrayList<>(Arrays.asList(4,4,5,5,6));
        List<Integer>actual=obj.fn(new int[]{5,5,4,6,4},5);
        assertEquals(expected,actual);

    }

    @Test
    void countsorttest2(){
        CountSort obj=new CountSort();
        List<Integer>expected=new ArrayList<>(Arrays.asList(9,9,9,2,5));
        List<Integer>actual=obj.fn(new int[]{9,9,9,2,5},5);
        assertEquals(expected,actual);

    }
}