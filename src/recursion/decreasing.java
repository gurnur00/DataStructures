package recursion;

import java.util.Scanner;

public class decreasing {
    public static void decOrder(int n) {
            if(n==0){
                return;
            }
            System.out.println(n);
            decOrder(n-1);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        decOrder(n);
    }
}
