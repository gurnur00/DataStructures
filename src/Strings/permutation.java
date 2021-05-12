package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class permutation {
    static void desiredPermutations(String str, char ch, int pos, int l, int r, ArrayList<String> perm)
    {
        for (int i = 0; i < str.length(); i++) {
            ch =str.charAt(i);
            String rem_str = str.substring(0, i) +str.substring(i + 1);
            desiredPermutations(rem_str, ch, pos, 0, 2, perm);
        }
    }

    // Driver code
    public static void main(String[] args) {
        ArrayList<String> perm = new ArrayList<>();
        desiredPermutations("ABC", 'B', 1, 0, 2, perm);
    }

}
