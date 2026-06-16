// Problem : Count digits in a number
// Approach :Extract the last digit and keep appending it to a new number.
// Time Complexity : O(log₁₀N)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/maths/reverse-digits-of-a-number.
// LeetCode : https://leetcode.com/problems/reverse-integer.

package basics.loops;
import java.util.Scanner;

public class ReverseDigits {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int rev = 0;
            while (n > 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            System.out.println("Reverse = " + rev);
        }
    }
}