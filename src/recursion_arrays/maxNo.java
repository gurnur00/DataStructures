package recursion_arrays;

import java.util.Scanner;

public class maxNo {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int idx = 0;
        int m = max(arr,idx);
        System.out.println(m);
    }

    public static int max(int[] arr, int idx){
        if(idx==arr.length){
            return idx;
        }
        int m = max(arr,idx+1);
        if(m>arr[idx]){
            return m;
        }
        else{
            return arr[idx];
        }
    }
}
