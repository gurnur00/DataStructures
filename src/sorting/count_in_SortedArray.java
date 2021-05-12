package sorting;

import java.util.Scanner;

public class count_in_SortedArray {

    public static int find_count(int[] arr, int find, boolean search) {
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = (high + low)/2;
            if(arr[mid]==find){
                result = mid;
                if(search){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else if(arr[mid]>find){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0;i<n;i++){
            int alength = scn.nextInt();
            int find = scn.nextInt();
            int[] arr = new int[alength];
            for(int j=0;j<alength;j++){
                arr[j]=scn.nextInt();
            }
            int first = find_count(arr,find,true);
            if(first==-1){
                System.out.println(0);
            }
            else{
                System.out.println(first);
            }
        }
    }
}
