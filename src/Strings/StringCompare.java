package Strings;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        if(str1.compareTo(str2)==0){
            System.out.println("Equal");
        }
        else if(str1.compareTo(str2)>0){
            System.out.println("Large");
        }
        else{
            System.out.println("Small");
        }
    }
}
