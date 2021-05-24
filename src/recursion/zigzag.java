package recursion;

import java.util.Scanner;

public class zigzag {
    public static void zOrder(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        zOrder(n-1);
        System.out.println(n);
        zOrder(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        zOrder(n);
    }
}
