package HackerRank;

import java.util.Scanner;

public class TimeConv {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int hour= Integer.parseInt(str.substring(0,2));
        String hourstr="";
        if(str.charAt(8)=='P' && hour!=12) {
            hour=hour+12;
        }
        if(str.charAt(8)=='A' && hour == 12) {
            hour = 0;
        }
        hourstr= String.valueOf(hour);
        if(hour==0) hourstr="00";
        if(hour<10) hourstr="0"+hour;

//hour 1,2,3,4,5,6,7,8,9
//hourstr 01 , 02 , 03 ......
        System.out.println(hourstr+str.substring(2,8));
    }
}
//12:05:45PM