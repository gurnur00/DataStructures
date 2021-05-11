package arrays;

import java.util.Scanner;

public class ceil_floor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int data=scn.nextInt();
        int l=0;
        int h=arr.length-1;
        int ceil=0;
        int floor=0;
        while(l<=h){
            int m=(l+h)/2;
            if(data<arr[m]){
                h=m-1;
                ceil=arr[m];
            }
            else if(data>arr[m]){
                l=m+1;
                floor=arr[m];
            }
            else{
                ceil=arr[m];
                floor=arr[m];
                break;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}
