package arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingDuplicateElement {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
//        creating new hashset so that values don't repeate
        Set<Integer> hs = new HashSet<Integer>();


        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
            hs.add(arr[i]);
        }

        // Iterating though the Set for each loop
        for (Integer value : hs)
            System.out.println(value);
        System.out.println();

    }
}

