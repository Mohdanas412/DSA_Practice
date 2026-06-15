// Problem : Pattern - 6: Inverted Numbered Right Pyramid
// Approach : The numbers decreasing From top to bottom,starting from 1 ,Print numbers starting from 1 to N - i using the formula (N - j + 1).
// Time Complexity : O(n^2)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/pattern/pattern-6-inverted-numbered-right-pyramid .

import java.util.Scanner;

public class InvertedRightAngled_Num{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {

                for(int j = n; j > i; j--) {
                    System.out.print((n - j + 1) + " ");
                }

                System.out.println();
            }
        }
    }
}