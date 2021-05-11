package sorting;

import java.util.Scanner;

public class quickSort {
    public static void quickSort1(int[] arr, int lo, int hi) {
        if(lo >= hi){
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        quickSort1(arr, lo, pi-1);
        quickSort1(arr ,pi+1, hi);

    }
    public static int partition(int[] arr, int pivot, int lo, int hi) {
        System.out.println("Pivot -> "+pivot);
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
        System.out.println("Pivot Index -> "+ ( j - 1 ));
        return ( j - 1 );
    }
    public static void swap(int [] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int b = 0;
        int c = arr.length-1;
        quickSort1(arr, b, c);
        print(arr);
    }
}
