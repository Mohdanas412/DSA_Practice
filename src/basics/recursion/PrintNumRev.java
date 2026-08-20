// Problem : Recursion: Print N to 1 using Recursion.
// Approach : Using Forward recursion.
// Time Complexity : O(n)  & Space Complexity : O(n) .
// Link : https://takeuforward.org/recursion/print-n-to-1-using-recursion.

import java.util.Scanner;

public class PrintNumRev{
    static void printnumrev(int current) {
        if(current < 1) {
            return;
        }
        System.out.println(current);

        printnumrev(current - 1);
    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int N = sc.nextInt();

        printnumrev(N);
        sc.close();

    }
}