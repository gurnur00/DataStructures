package assignment1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int f=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("NOT PRIME");
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("PRIME");
        }
    }
}
