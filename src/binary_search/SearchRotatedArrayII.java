import java.util.*;

class SearchRotatedArrayII {

    public static boolean search(int[] nums, int k) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == k)
                return true;

            // Duplicate case
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                if (nums[low] <= k && k < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;

            }
            // Right half is sorted
            else {

                if (nums[mid] < k && k <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(search(nums, k));

        sc.close();
    }
}