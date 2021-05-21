package Strings;

import java.util.Scanner;

public class string_compression {
    public static String compression1(String str){
        // write your code here
        String s = str.substring(0,1);
        for(int i = 1;i<str.length();i++){
            char ch = str.charAt(i);
            char prev = str.charAt(i-1);
            if(prev!=ch){
                s = s + ch;
            }
        }

        return s;
    }

    public static String compression2(String str){
        // write your code here
        String s = str.substring(0,1);
        int count = 1;
        for(int i = 1;i<str.length();i++){
            char ch = str.charAt(i);
            char prev = str.charAt(i-1);
            if(prev==ch){
                count++;
            }
            else{
                if(count>1){
                    s = s + count;
                    count = 1;
                }
                s = s + ch;
            }
        }
        if(count>1){
            s = s + count;
            count = 1;
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
