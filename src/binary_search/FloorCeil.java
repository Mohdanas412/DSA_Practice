import java.util.*;

class FloorCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int x = sc.nextInt();
        int low = 0, high = n - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                floor = ceil = a[mid];
                break;
            } else if (a[mid] < x) {
                floor = a[mid];
                low = mid + 1;
            } else {
                ceil = a[mid];
                high = mid - 1;
            }
        }

        System.out.println(floor + " " + ceil);
    }
}