package assignment2_arrays;

import java.util.Scanner;

public class sumOF2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int j = 0;j<n;j++){
            arr2[j] = scn.nextInt();
        }
        if(n>n2){
            int[] a = new int[n];
        }
        else{
            int[] a = new int[n2];
        }

    }
}
