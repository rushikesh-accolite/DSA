package org.dsa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeadersOfArrayTest {

    @Test
    void leaders() {
        LeadersOfArray obj=new LeadersOfArray();
        List<Integer> expected=new ArrayList<>(Arrays.asList(4,0));
        List<Integer> output=obj.leaders(new int[]{1,2,3,4,0},5);
        assertEquals(expected,output);
    }

    @Test
    void leaders2() {
        LeadersOfArray obj=new LeadersOfArray();
        List<Integer> expected=new ArrayList<>(Arrays.asList(17,5,2));
        List<Integer> output=obj.leaders(new int[]{16,17,4,3,5,2},6);
        assertEquals(expected,output);
    }
}