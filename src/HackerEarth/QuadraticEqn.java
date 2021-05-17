package HackerEarth;

import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int n1 = 0;
        int n2 =0;
        double firstRoot = 0;
        double secondRoot = 0;
        for(int i = 0;i<n;i++){
            n1 = scn.nextInt();
            n2 = scn.nextInt();
        }
        int c = 0;
        double determinant = (n2*n2)-(4*n1*c);
        double sqrt = Math.sqrt(determinant);
        if(determinant>0) {
            firstRoot = (-n2 + sqrt) / (2 * n1);
            secondRoot = (-n2 - sqrt) / (2 * n1);
        }
    }
}
