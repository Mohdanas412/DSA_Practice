// Problem : Check if a number is Palindrome or Not
// Approach :Reverse the number and compare it with the original number.
// Time Complexity : O(log N)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not.
// LeetCode : https://leetcode.com/problems/palindrome-number.

package basics.loops;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int original = n;
            int rev = 0;

            while (n > 0) {

                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            if (original == rev) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }
}