// Problem : Pattern - 4: Right-Angled Number Pyramid - II.
// Approach : In each row, print number starting from 1 to row number times.
// Time Complexity : O(n^2)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/pattern/pattern-3-right-angled-number-pyramid


import java.util.Scanner;

public class RightAngledTri_Num_II{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {

                for(int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }
}