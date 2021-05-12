package assignment1;

import java.util.Scanner;


public class squareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            double root = Math.sqrt(arr[i]);
            System.out.printf("%.2f",root);
            System.out.println();
        }
    }
}
