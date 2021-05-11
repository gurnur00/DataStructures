package sorting;

import java.util.Scanner;

public class quickSelect {
    public static int quickSelect1(int[] arr, int lo, int hi, int k) {
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        if(k > pi) {
            return quickSelect1(arr, pi + 1, hi, k);
        }
        else if(k < pi){
            return quickSelect1(arr, lo, pi-1 , k);
        }
        else{
            return arr[pi];
        }
    }
    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo;
        int j = lo;
        while(i <= hi){
            if(arr[i] <= pivot){
                swap(arr, i, j);
                i++;
                j++;
            }
            else{
                swap(arr, i, j);
                i++;
            }
        }
        return ( j - 1 );
    }
    public static void swap(int [] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int [] arr) {
        for( int i=0; i <= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        System.out.println(quickSelect1(arr, 0, arr.length-1,b-1));
    }
}
