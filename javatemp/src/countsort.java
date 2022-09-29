import java.util.Scanner;
import java.util.*;
public class countsort {

    static void fn(int a[], int n) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        for(int i=0;i<n;i++){
            mp.put(list.get(i),mp.getOrDefault(list.get(i),0)+1);
        }
        Collections.sort(list, (n1, n2) -> {
            int f1 = mp.get(n1);
            int f2 = mp.get(n2);

            if (f1 != f2) return f2-f1;
            return n1 - n2;
        });
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();   //testcases
        for (int i = 0; i < t; i++) {
            int n = x.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = x.nextInt();
            }
            fn(a, n);
        }

    }
}
