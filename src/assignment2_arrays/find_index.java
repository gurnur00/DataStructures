package assignment2_arrays;

import java.util.Scanner;

public class find_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int a=-1;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == m) {
                a=i;
                break;
            }
        }
        System.out.println("The number is found at " + a + "th index");
    }
}
