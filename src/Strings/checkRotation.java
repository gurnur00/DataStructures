package Strings;

import java.util.Scanner;

public class checkRotation {
    public static int Compare(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return 0;
        }
        String str3 = str1+str1;
        if(str3.contains(str2)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0;i<n;i++){
            String str1 = scn.nextLine();
            String str2 = scn.nextLine();
            Compare(str1,str2);
        }
    }
}
