// Problem : Count digits in a number
// Approach : Keep dividing by 10 until the number becomes 0; count the divisions..
// Time Complexity : O(n)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/data-structure/count-digits-in-a-number.

//package basics.loops;
import java.util.Scanner;

public class CountDigits{
    public static void main(String [] args) {
        try(Scanner sc = new Scanner(System.in) ) {
            System.out.println("Enter n:");
            int n = sc.nextInt();

            int count = 0;
            while (n > 0) {
                count ++ ;
                n = n / 10 ;
                
            }
            System.out.println(count);
        }
    }
 }
