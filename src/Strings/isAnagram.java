package Strings;

import java.util.Scanner;

public class isAnagram {
        static int isAnagram(String a, String b){
            // Write your code here
            int result = 1;
            int visit = -1;
            int[] freq = new int[b.length()];
            for(int i=0;i<a.length();i++){
                int check = 0;
                for(int j = 0;j<b.length();j++){
                    if(a.charAt(i)==b.charAt(j) && freq[j] != visit){
                        freq[j]=visit;
                        check = 1;
                        break;
                    }
                }
                if(check==0){
                    result = 0;
                }
            }
            return result;
        }
    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "cba"));
    }
}
