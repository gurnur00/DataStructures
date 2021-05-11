package assignment1;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){
                    System.out.print(i+1);
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}