package arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
