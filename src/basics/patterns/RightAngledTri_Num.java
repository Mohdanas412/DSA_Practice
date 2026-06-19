// Problem : Pattern - 3: Right-Angled Number Pyramid.
// Approach : In each row, print row number equal to the row number times.
// Time Complexity : O(n^2)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/pattern/pattern-3-right-angled-number-pyramid

package basics.patterns;
import java.util.Scanner;

public class RightAngledTri_Num{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {

                for(int j = 1; j <= i; j++) {
                    System.out.print(i);
                }

                System.out.println();
            }
        }
    }
}