import java.util.*;

class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int x = sc.nextInt();
        int low = 0, high = n - 1, ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}