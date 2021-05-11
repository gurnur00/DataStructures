package sorting;

import java.util.Scanner;

public class mergeSort {
    public static int[] mergeSortArray(int [] arr,int lo, int hi){
        if (lo==hi){
            int[] ba=new int[1];
            ba[0]=arr[lo];
            return ba;
        }
        int mid = (lo + hi) / 2;
        int[] fsh=mergeSortArray(arr, lo, mid);
        int[] ssh=mergeSortArray(arr, mid+1, hi);
        int[] fsa=mergeTwoSortedArrays(fsh,ssh);
        return fsa;
    }
    public static int[] mergeTwoSortedArrays(int [] a,int [] b){
        System.out.println("Merging these two arrays ");
        System.out.print("Left Array -> ");
        print(a);
        System.out.print("\nRight Array -> ");
        print(b);
        int[] res= new int[a.length + b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
                k++;
            }
            else{
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < a.length ){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length ){
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
    public static void print(int [] arr) {
        for( int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int [] sa = mergeSortArray(arr,0, arr.length-1);
        System.out.println("Sorted Array -> ");
        for(int i=0;i<n;i++){
            System.out.print(sa[i]+" ");
        }
    }
}
