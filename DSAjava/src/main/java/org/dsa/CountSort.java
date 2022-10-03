/*Given an array of integers, sort the array according to frequency of elements. 
That is elements that have higher frequency come first. 
If frequencies of two elements are same, then smaller number comes first. */

package org.dsa;

import java.util.*;

public class CountSort {

        static List<Integer> fn(int a[], int n) {
            Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(a[i]);
            }
            for(int i=0;i<n;i++){
                mp.put(list.get(i),mp.getOrDefault(list.get(i),0)+1); //Store Frequency of all elements of the Array
            }
            Collections.sort(list, (n1, n2) -> {                //Custom Comparator to sort the Array
                int f1 = mp.get(n1);
                int f2 = mp.get(n2);

                if (f1 != f2) return f2-f1;             //Compare Frequencies
                return n1 - n2;                         //If frequencies are same sort by their value
            });
            return list;                //Return the Answer
        }

}
