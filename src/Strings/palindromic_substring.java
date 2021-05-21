package Strings;

import java.util.Scanner;

public class palindromic_substring {
    private static boolean isPalindrome(String sub){
        int i = 0;
        int j = sub.length()-1;
        while(i<=j){
            char ch1 = sub.charAt(i);
            char ch2 = sub.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    private static void solution(String s){
        //write your code here
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                if(isPalindrome(sub) == true){
                    System.out.println(sub);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        solution(str);
    }
}
