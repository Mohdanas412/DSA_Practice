// Problem : Recursion: Print Name N times using Recursion.
// Approach : Call recusive function (n-1) until it reach n and print name.
// Time Complexity : O(n)  & Space Complexity : O(n) .
// Link : https://takeuforward.org/recursion/print-name-n-times-using-recursion

import java.util.Scanner;
public class PrintName {
    static void printname(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println("Anas");
        printname(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printname(n);
    }
}