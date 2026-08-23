// Problem : Recursion: Print Fibonacci Series up to Nth term
// Approach :Use two variables to store the previous two Fibonacci numbers and iteratively calculate the next number as their sum.
// Time Complexity : O(n)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/arrays/print-fibonacci-series-up-to-nth-term.

import java.util.Scanner;

public class fabNum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}