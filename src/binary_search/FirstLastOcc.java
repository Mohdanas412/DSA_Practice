import java.util.*;

public class FirstLastOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int x = sc.nextInt();

        int first = -1, last = -1;
        int low = 0, high = n - 1;

        // First occurrence
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (a[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        // Last occurrence
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (a[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println(first + " " + last);
    }
}