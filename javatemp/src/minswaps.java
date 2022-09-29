import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class minswaps {

    static void swap(int[] arr, int a, int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    static void minswap(int a[],int n){
        int ans=0;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            mp.put(a[i],i);
        }
        int[] temp = Arrays.copyOfRange(a, 0, n);
        for (int i = 0; i < n; i++)
        {


            if (a[i] != temp[i])
            {
                ans++;
                int current = a[i];

                swap(a, i, mp.get(temp[i]));


                mp.put(current, mp.get(temp[i]));
                mp.put(temp[i], i);
            }
        }
        System.out.println(ans);;
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();   //testcases
        for(int i=0;i<t;i++){
            int n=x.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=x.nextInt();
            }
            minswap(a,n);
        }

    }
}
