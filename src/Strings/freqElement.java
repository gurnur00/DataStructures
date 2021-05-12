package Strings;

import java.util.Scanner;

public class freqElement {
    public static void freqFind(int arr[]) {
        int visited = -1;
        int[] freq = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            int count = 1;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i]==arr[j] && freq[j]!= visited){
                    freq[j] = visited;
                    count++;
                }
            }
            if(freq[i]!=visited){
                System.out.println(arr[i] + " occurs "+count+" times");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i < n;i++){
            arr[i] = scn.nextInt();
        }
        freqFind(arr);
    }

}
