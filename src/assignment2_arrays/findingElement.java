package assignment2_arrays;

import java.util.Scanner;

public class findingElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int find = scn.nextInt();
        int found=-1;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]==find){
               found = j;
               break;
            }
        }
        System.out.println(found);
    }
}
