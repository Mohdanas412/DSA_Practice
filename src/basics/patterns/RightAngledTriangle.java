// Problem : Pattern-2: Right-Angled Triangle Pattern.
// Approach : In each row, print stars equal to the row number..
// Time Complexity : O(n^2)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/pattern/pattern-2-right-angled-triangle-pattern

package basics.patterns;
import java.util.Scanner;

public class RightAngledTriangle{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {

                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}