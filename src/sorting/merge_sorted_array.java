package sorting;

import java.util.Scanner;

public class merge_sorted_array {
    public static int[] mergeTwoSortedArrays(int [] a,int [] b){
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
        for( int i=0; i <= arr.length-1; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int m=scn.nextInt();
        int [] brr = new int[m];
        for(int i=0;i<m;i++){
            brr[i]=scn.nextInt();
        }
        int [] mergedArray = mergeTwoSortedArrays(arr, brr);
        print(mergedArray);
    }
}
