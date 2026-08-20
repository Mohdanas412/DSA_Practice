// Problem : Recursion: Print 1 to N using Recursion.
// Approach : Using Forward recursion.
// Time Complexity : O(n)  & Space Complexity : O(n) .
// Link : https://takeuforward.org/recursion/print-1-to-n-using-recursion.

import java.util.Scanner;

public class PrintNum{
    static void printnum(int current,int N) {
        if(current > N) {
            return;
        }
        System.out.println(current);

        printnum(current + 1, N);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();

        printnum(1,N);
        sc.close();

    }
}