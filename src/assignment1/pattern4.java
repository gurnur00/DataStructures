package assignment1;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a+"\t");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
