package recursion_arrays;

import java.util.Scanner;

public class revArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int idx = 0;
        displayArr(arr,idx);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        displayArr(arr,idx+1);
        System.out.println(arr[idx]);


    }
}
