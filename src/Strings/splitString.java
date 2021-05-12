package Strings;

import java.util.Scanner;

public class splitString {
    private static void strtokCode(String str, char delim){
        String[] arstr = str.split(String.valueOf(delim));
        for(int i=0;i<arstr.length;i++){
            System.out.println(arstr[i]);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String str = in.next();
            char ch = in.next().charAt(0);
            strtokCode(str,ch);
            // Write your code here
        }
    }
}
