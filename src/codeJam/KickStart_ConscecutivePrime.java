package codeJam;

import java.util.Scanner;

public class KickStart_ConscecutivePrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int code=0;
        int a=0,b=2,c=a*b;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < n ; i++){
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    code=1;
                    a=b;
                    b=j;
                }
                c=a*b;
                if(c==arr[i]){
                    System.out.println("Case #"+i+": "+arr[i]);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(code==1){
                System.out.println("Case #"+i+": "+arr[i]);
            }
        }
    }
}
