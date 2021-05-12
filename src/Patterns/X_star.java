package Patterns;

import java.util.Scanner;

public class X_star {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = 1;
        int spc = 0;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++)  //prints the stars in the row
            {
                if(i == j || i + j == n + 1)
                {
                    System.out.print("*	");
                }
                else
                    System.out.print("	");
            }
            System.out.println();
        }
    }
}
