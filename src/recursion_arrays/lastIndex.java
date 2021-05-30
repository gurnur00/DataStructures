package recursion_arrays;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int l = LastIndex(arr,arr.length-1,x);
        System.out.println(l);
    }

    public static int LastIndex(int[] arr, int idx, int x){
        if(idx == 0){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        else{
            int li = LastIndex(arr,idx-1,x);
            return li;
        }
    }
}
