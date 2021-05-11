package assignment1;

import java.util.Scanner;

public class sum_odd_even {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int pow=10;
        int j=0;
        int num =0;
        int e=0,o=0;
        while(n!=0) {
            j = n % 10;
            num = (num * pow) + j;
            n=n/10;
        }
        while(num!=0){
            o=o+num%10;
            num=num/10;
            e=e+num%10;
            num=num/10;
        }
        System.out.println("Odd sum is "+o);
        System.out.println("Even sum is "+e);
    }
}
