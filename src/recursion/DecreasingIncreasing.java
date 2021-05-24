package recursion;

import java.util.Scanner;

public class DecreasingIncreasing {
    public static void incDecOrder(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        incDecOrder(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        incDecOrder(n);
    }
}
