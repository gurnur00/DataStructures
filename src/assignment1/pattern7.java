package assignment1;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=n/2+1;
        int st=1;
        for(int i=1;i<=n;i++) {
            int val=i;
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(val+"\t");
                if(j<i){
                    val++;
                }
                else{
                    val--;
                }
            }
            if (i <= n / 2+1) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
}
