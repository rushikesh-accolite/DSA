/*Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. 
Your task is to find the maximum number of toys you can buy with K amount.  */

package org.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BuyToys {

         static int toys(int a[], int n, int amount){
            Arrays.sort(a);  //Sorting the toys array
            int ans=0;

            for(int i=0;i<n;i++){
                if(amount>=a[i]){  //If amount is Greater than equal to current toy price you can buy it
                    ans++;
                    amount-=a[i];  // reduce the amount 
                }
                else {
                    break;    //cannot by if price exceeds the Amount 
                }
            }
            return ans; //Return Answer
        }

       

}
