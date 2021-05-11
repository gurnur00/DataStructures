package assignment2_arrays;

import java.util.Scanner;

public class mirror_inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        int [] inv=new int[n];
        for(int j=0;j<a.length;j++){
            int v=a[j];
            inv[v]=j;
        }
        for(int i=0;i<inv.length;i++){
            System.out.print(inv[i]+"\t");
        }
        int flag=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==inv[i]){
                flag=0;
            }
            else{
                flag=-1;
                break;
            }
        }
        if(flag==0){
            System.out.println("\n It is the mirror inverse");
        }
        else{
            System.out.println("\n It is not the mirror inverse");
        }
    }
}
