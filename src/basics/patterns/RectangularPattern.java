// Problem : Pattern 1 - Rectangular Star Pattern .
// Approach : Iterate through N rows and N columns using nested loops, Printing " * " at each position .
// Time Complexity : O(n^2)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/pattern/pattern-1-rectangular-star-pattern

package basics.patterns;
import java.util.Scanner;

public class RectangularPattern{
    public static void main(String[] args) {

      try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {

                for(int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}