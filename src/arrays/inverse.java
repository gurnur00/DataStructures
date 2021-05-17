package arrays;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int [] in=new int[n];
        for(int j=0;j<a.length;j++){
            int v=a[j];
            in[v]=j;
        }
        for(int i=0;i<in.length;i++){
            System.out.print(in[i]);
        }
    }
}
