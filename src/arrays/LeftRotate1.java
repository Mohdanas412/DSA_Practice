import java.util.*;

class LeftRotate1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int k = sc.nextInt();
        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++)
            temp[i] = a[n - k + i];

        for (int i = n - 1; i >= k; i--)
            a[i] = a[i - k];

        for (int i = 0; i < k; i++)
            a[i] = temp[i];

        for (int x : a)
            System.out.print(x + " ");
    }
}