package assignment1;

import java.util.Scanner;

public class fibonacci_less_than_n {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if(n==1){
            System.out.println(a);
        }
        if(n==2){
            System.out.println(a);
            System.out.println(b);
        }
        if(n==1){
            c=1;
        }
        for (int j = 2; j < n; j++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
        }
    }
}

