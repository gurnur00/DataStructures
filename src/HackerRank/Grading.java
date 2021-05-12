package HackerRank;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            if(arr[i]>37){
                if(arr[i]%5==0){
                    System.out.println(arr[i]);
                }
                else{
                    arr[i]=arr[i]+1;
                    if(arr[i]%5==0){
                        System.out.println(arr[i]);
                    }
                    else{
                        if((arr[i]+1)%5==0){
                            System.out.println(arr[i]+1);
                        }
                        else{
                            System.out.println(arr[i]-1);
                        }
                    }
                }
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}
