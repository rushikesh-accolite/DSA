/*Given an array of n distinct elements.
Find the minimum number of swaps required to sort the array in strictly increasing order.
 */


package org.dsa;
import java.util.Arrays;

public class MinimumSwaps {


    public int minswap(int[] arr, int n)
    {
        int res = 0;
        int[] temp = new int[n];
        for(int i=0;i<n;i++)
            temp[i]=arr[i]; //Making a new array which will be sorted and compared with original array
        Arrays.sort(temp);
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != temp[i])       //If position of sorted element is not correct
            {
                res++;                     //Increment the counter
                swap(arr, i, posi(arr, n, temp[i]));   //Swap with correct position
            }
        }
        return res;                     //Return the counter
    }

    void swap(int[] arr, int cur, int neww)
    {
        int temp = arr[cur];
        arr[cur] = arr[neww];
        arr[neww] = temp;
    }
    public int posi(int[] arr,int n, int element)
    {
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    }

