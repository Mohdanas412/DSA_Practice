// Problem : Check if a number is Armstrong Number or not.
// Approach : Digit extraction + power-sum comparison using the number of digits.
// Time Complexity : O(log10N + 1)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not.

package basics.math;
import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int A = String.valueOf(num).length();
        int sum = 0;
        int n = num;

        while(n>0) {
            int lastDigit = n % 10;
            sum += Math.powExact(lastDigit, A);
            n /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        if(isArmstrong(n)){
            System.out.println("It's a Armstrong Number!");
        } else {
            System.out.println("Not a Armstrong Number!");
        }
        sc.close();
    }
}