package sorting;

import java.util.Scanner;

public class sort_dates {
    public static void sortDates(String[] arr) {
        countSort(arr, 1000000, 100,2);  // days
        countSort(arr, 10000, 100,2);  // months
        countSort(arr, 1, 10000,2);  // years

    }

    public static void countSort(String[] arr, int div, int mod, int range) {
        String[] ans=new String[arr.length];
        int[] freq = new int[10];
        for( int i=0; i < arr.length; i++){
            freq[Integer.parseInt(arr[i],10)/ div % mod]++;
        }
        for(int i=1; i< freq.length;i++){
            freq[i] = freq[i] + freq[i-1];
        }
//        for( int i=arr.length-1; i >= 0; i--){
//            int pos = freq[(arr[i] / div) % mod]-1;
//            ans [pos] = arr[i];
//            freq[(arr[i] / div) % mod]--;
//        }
        for(int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
        print(arr);
    }
    public static void print(String [] arr) {
        for( int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n;i++){
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }
}
