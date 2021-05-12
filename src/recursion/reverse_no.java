package recursion;

import java.util.Scanner;

public class reverse_no {
    public static void rev(int n,int res) {
        if(n==0){
            System.out.println(res);
            return;
        }
        int rem = n%10;
        res = (res*10)+rem;
        rev(n/10,res);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        rev(n,0);

    }
}
