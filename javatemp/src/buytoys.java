import java.util.Arrays;
import java.util.Scanner;

public class buytoys {

    static void toys(int a[],int n,int amount){
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(amount>=a[i]){
                System.out.print(a[i]+" ");
                amount-=a[i];
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int t=x.nextInt();   //testcases
        for(int i=0;i<t;i++){
            int amt=x.nextInt();
            int n=x.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=x.nextInt();
            }
            toys(a,n,amt);
        }
}
}
