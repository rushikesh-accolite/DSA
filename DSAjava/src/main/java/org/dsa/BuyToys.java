package org.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BuyToys {

         static int toys(int a[], int n, int amount){
            Arrays.sort(a);
            int ans=0;

            for(int i=0;i<n;i++){
                if(amount>=a[i]){
                    ans++;
                    amount-=a[i];
                }
                else {
                    break;
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner x=new Scanner(System.in);
                int amt=x.nextInt();
                int n=x.nextInt();
                int a[]=new int[n];
                for(int j=0;j<n;j++){
                    a[j]=x.nextInt();
                }
                int ans=toys(a,n,amt);
                System.out.println(ans);

        }

}
