package TechGig;

import java.util.Scanner;

public class Virus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.nextLine();
        int ppl = scn.nextInt();
        int count = 0;
        for(int i = 0;i < ppl;i++){
            String check = scn.nextLine();
            scn.nextLine();
            if(str.charAt(i)==check.charAt(i)){
                count++;
            }
        }
        if(count!=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
