package assignment1;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int a = n1*n1;
        int b = n2*n2;
        int c = n3*n3;
        if(a==b+c || b==a+c || c==a+b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
