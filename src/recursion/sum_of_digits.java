package recursion;

import java.util.Scanner;

public class sum_of_digits {
    public static void print_sum(int num,int sum) {
        if(num==0){
            System.out.println(sum);
            return;
        }
        int rem=num%10;
        print_sum(num/10,sum+rem);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            int num = scn.nextInt();
            print_sum(num,0);
        }

    }
}
