package codeJam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] str =new String[n];
        scn.nextLine();
        for(int i=0;i<n;i++){
            str[i]=scn.nextLine();
        }
        boolean flag = true;
        int left=0;
        int right = str.length-1;
        int res=0;

    }
}
