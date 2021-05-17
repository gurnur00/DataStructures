package assignment2_arrays;

import java.util.Scanner;

public class reverseDiffMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        long startTime = System.currentTimeMillis();
        for(int j = arr.length-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
