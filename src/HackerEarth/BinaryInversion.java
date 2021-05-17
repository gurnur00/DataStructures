package HackerEarth;

import java.util.Scanner;

public class BinaryInversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int x = scn.nextInt();
        long a = n*b;
        if(x>a*b){
            System.out.println("-1");
        }
        else{
            long p = x/a;
            long q = x%a;
            for(long i = 0;i<n-p-a-1;i++){
                System.out.print("0 ");
            }
            for(long i = 0;i<q;i++){
                System.out.print("1 ");
                break;
            }
            System.out.print("0 ");
            for(long i = 0;i<a-q;i++){
                System.out.print("1 ");
            }
            for(long i = 0;i<p;i++){
                System.out.print("0 ");
            }
        }


    }
}
