package basics.math;
// Problem : Find GCD of two numbers .
// Approach :Brute Force: Check all possible common divisors and store the largest one.
// Time Complexity : O(min(n1,n2))  & Space Complexity : O(1) .
// Link : https://takeuforward.org/data-structure/find-gcd-of-two-numbers.

//package basics.math;
import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int n2 = sc.nextInt();

            int gcd = 1;

            for (int i = 1; i <= Math.min(n1, n2); i++) {

                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
             System.out.println("GCD = " + gcd);
        }
    }
}