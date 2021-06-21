package Walmart;

import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i<X;i++){
            arr.add(i);
        }
        int count = 0;
        for(int i = X-1; i > 0;i--){
            if(arr.get(i-1)<=2*arr.get(i)){
//                arr.remove(i-1);
                count++;
            }
        }
        System.out.println(count);
    }
}
