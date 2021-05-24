package recursion;

import java.util.Scanner;

public class increasing {
    public static void incOrder(int n) {
        if(n==0){
            return;
        }
        incOrder(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        incOrder(n);
    }
}
