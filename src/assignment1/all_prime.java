package assignment1;

import java.util.Scanner;

public class all_prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int f=0;
        for(int i=2;i<=n;i++){
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
