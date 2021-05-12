package Strings;

import java.util.Scanner;

public class rotationCount {
    static int countRotations(int arr[], int n)
    {
        // We basically find index of minimum
        // element
        int min = arr[0], min_index = -1;
        for (int i = 0; i < n; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
                min_index = i+1;
            }
        }
        return min_index;
    }

    // Driver program to test above functions
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();

        for(int i=0;i<test;i++) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            arr[i]=scn.nextInt();
            System.out.println(countRotations(arr, n));
        }
    }
}
