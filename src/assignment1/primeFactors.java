package assignment1;

import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=2;
        while(n!=0 && a<=n){
            if(n%a==0){
                System.out.println(a);
                n=n/a;
            }
            else{
                a++;
            }
        }
    }
}
