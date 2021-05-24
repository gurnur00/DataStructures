package recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        int factorial = fact(n-1);
        int f = n*factorial;
        return f;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int fn = fact(n);
        System.out.println(fn);
    }
}
