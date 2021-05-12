package Strings;

import java.util.Scanner;

public class countWords {
    private static void words(String str, boolean flag) {
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' '){
                flag = true;
            }
            else if(str.charAt(i)!=' ' && flag){
                count++;
                flag=false;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean flag = true;
        words(str,flag);
    }
}
