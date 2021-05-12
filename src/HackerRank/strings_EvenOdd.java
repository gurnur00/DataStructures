package HackerRank;

import java.util.Scanner;

public class strings_EvenOdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String[] str=new String[n];
        scn.nextLine();
        for(int i=0;i<n;i++){
            str[i]=scn.nextLine();
        }
        for(int i=0;i<n;i++){
            for(int j=0; j < str[i].length(); j++){
                if(j%2==0){
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.print(" ");
            for(int j=0;j < str[i].length(); j++){
                if(j%2!=0){
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
