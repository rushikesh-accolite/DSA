package org.dsa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class LeadersOfArray {

         static List<Integer> leaders(int a[], int n){
            int cur=a[n-1];
            List<Integer> ans=new ArrayList<Integer>();
            ans.add(cur);
            for(int i=n-2;i>=0;i--){
                if(a[i]>cur){
                    cur=a[i];
                    ans.add(cur);
                }
            }
             Collections.reverse(ans);
            return ans;
        }

        public static void main(String[] args) {
            Scanner x=new Scanner(System.in);
            int n=x.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=x.nextInt();
                }
            List<Integer>ans=leaders(a,n);
            System.out.println(ans);
            }





}
