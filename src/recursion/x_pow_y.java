package recursion;

import java.util.Scanner;

public class x_pow_y {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int ans = power(x,y);
        System.out.println(ans);
    }

    public static int power(int x, int y){
        if(y==0){
            return 1;
        }
        int xnm1 = power(x,y-1);
        int xn = x*xnm1;
        return xn;
    }
}
