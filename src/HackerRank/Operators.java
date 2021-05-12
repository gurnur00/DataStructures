package HackerRank;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        double meal_cost=scn.nextDouble();
        int tip_per=scn.nextInt();
        int tax_per=scn.nextInt();

        double tip=0;
        double tax=0;
        double total=0;

        tip=(meal_cost/100)*tip_per;
        tax=(meal_cost/100)*tax_per;
        total = meal_cost+tip+tax;

        int a =(int) Math.round(total);
        System.out.println(a);
    }
}
