// Problem : Pattern-5: Inverted Right Pyramid.
// Approach : The number of stars decreasing From top to bottom,print N to N-1 till 1 left in the end.
// Time Complexity : O(n^2)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/pattern/pattern-5-inverted-right-pyramid.


import java.util.Scanner;

public class InvertedRightAngled{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++) {

                for(int j = n; j > i; j--) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}