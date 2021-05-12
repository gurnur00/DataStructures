package codeJam;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        String[] str =new String[n];
        scn.nextLine();
        for(int i=0;i<n;i++){
            str[i]=scn.nextLine();
        }

//        IoIoIoIo
//        IoIoIoIo
//        IoIoIoIo
//        IoIoIoIo
//        IoIoIoIo

        for(int i=0;i<n;i++){
            int a=0,b=0,c=0;
            for(int j=0;j<str[i].length();j++){
                if(str[i].charAt(j)=='I'){
                    a++;
                }
                else if(str[i].charAt(j)=='O'){
                    if(a>0){
                        c++;
                        a--;
                    }
                    else{
                        b--;
                    }
                }
                else if(str[i].charAt(j)=='i'){
                    b++;
                }
                else if(str[i].charAt(j)=='o') {
                    if(b>0){
                        b--;
                    }
                    else{
                        a--;
                    }
                }
            }
            System.out.println(c);

        }



    }
}

//Input          Output

//5
//IiOioIoO     Case #1: 2
//IiOOIo       Case #2: 1
//IoiOiO       Case #3: 0
//io           Case #4: 0
//IIIIOOOO     Case #5: 4
