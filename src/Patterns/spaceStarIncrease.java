package Patterns;

import java.util.Scanner;

public class spaceStarIncrease {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = 1;
        int spc = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=spc;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=str;j++){
                System.out.print("*\t");
            }
            spc--;
            str++;
            System.out.println();

        }
    }
}
