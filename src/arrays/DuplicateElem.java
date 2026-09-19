//package arrays;

import java.util.*;

public class DuplicateElem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }

        System.out.println("Unique elements: " + (j + 1));

        for (int i = 0; i <= j; i++)
            System.out.print(a[i] + " ");
    }
}