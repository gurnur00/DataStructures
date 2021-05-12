package assignment2_arrays;

import java.util.Scanner;

public class Partition {
    public static void part(int arr[], int x,int n) {
                int i, j, temp;
                i = 0;
                j = n-1;

                while (i < j)
                {
                    while (arr[i] <=x)
                        i++;
                    while (arr[j] > x)
                        j--;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }
    }
}
