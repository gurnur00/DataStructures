package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Balancing_Brackets {
    public static boolean handleClosing(Stack<Character> st, char corres_ch) {
        if (st.size() == 0) {
            return false;
        }
        else if (st.peek() != corres_ch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')') {
                boolean val = handleClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == '}') {
                boolean val = handleClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == ']') {
                boolean val = handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else{

            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
