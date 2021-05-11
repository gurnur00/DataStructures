package arrays;

import java.util.Scanner;

public class rotate {
    public static void reverse(int [] a,int i,int j) {
        int li=i;
        int ri=j;
        while(li<ri){
            int temp=a[li];
            a[li]=a[ri];
            a[ri]=temp;
            li++;
            ri--;
        }
    }
    public static void rotated(int[] a,int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        rotated(a,k);
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
    }

}
