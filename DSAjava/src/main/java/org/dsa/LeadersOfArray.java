/*Given an array A of positive integers. Your task is to find the leaders in the array. 
An element of an array is leader if it is greater than or equal to 
all the elements to its right side. The rightmost element is always a leader.*/

package org.dsa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class LeadersOfArray {

         static List<Integer> leaders(int a[], int n){
            int cur=a[n-1];  //Last element is always a leader
            List<Integer> ans=new ArrayList<Integer>();
            ans.add(cur);
            for(int i=n-2;i>=0;i--){
                if(a[i]>cur){  //Keep track of current Leader
                    cur=a[i];
                    ans.add(cur);
                }
            }
             Collections.reverse(ans);       
            return ans;    //Return answer
        }


}
