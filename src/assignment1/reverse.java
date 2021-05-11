package assignment1;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int j=0;
        int pow=10;
        int num=0;
        while(n!=0){
            j=n%10;
            num=(num*pow)+j;
            n=n/10;
        }
        System.out.println(num);
    }

}
