package assignment1;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if(n==1){
            c=1;
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
