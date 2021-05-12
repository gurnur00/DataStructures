package recursion;

import java.util.Scanner;

public class prime_factors {
    public static void prime(int n,int a) {
        if(n==0 || a>n){
            return;
        }
        int fact = n%a;
        if(fact==0 ){
            System.out.println(a);
            n=n/a;
        }
        else{
            a++;
        }
        prime(n,a);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        prime(n,2);
    }
}
