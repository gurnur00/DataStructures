package assignment1;

import java.util.Scanner;

public class prime_from_a_to_b {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        int f=0;
        for(int i = n;i<t;i++){
            f=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.println(i);
            }
        }
    }
}
