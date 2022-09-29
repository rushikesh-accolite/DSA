import java.util.Scanner;

public class leadersarray {

    static void leaders(int a[], int n){
        int cur=a[n-1];
        System.out.print(cur+" ");
        for(int i=n-2;i>=0;i--){
            if(a[i]>cur){
                cur=a[i];
                System.out.print(cur+" ");
            }
        }
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
            leaders(a,n);
        }

    }


}
