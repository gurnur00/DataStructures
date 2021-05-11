package assignment1;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=n-1;
        int st=1;
        int a=1;
        for(int i=1;i<=(2*n)-1;i++) {
            int val=a;
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(val+"\t");
                if(j<=st/2){
                    val++;
                }
                else{
                    val--;
                }
            }
            if (i <= n-1 ) {
                sp--;
                st += 2;
                a++;
            } else {
                sp++;
                st -= 2;
                a--;
            }
            System.out.println();
        }
    }
}
