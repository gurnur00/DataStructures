package assignment1;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp=n+1;
        int st=1;
        for(int i=0;i<n;i++){
            for(int j = 1; j <= st; j++){
                System.out.print(j+"\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if(i==n-1){
                st--;
            }
            for (int j = st; j > 0; j--) {
                System.out.print(j+"\t");
            }
            if (i < n) {
                sp--;
                st ++;
            }
            else {
                sp++;
                st --;
            }
            System.out.println();
            sp--;
        }
    }
}
