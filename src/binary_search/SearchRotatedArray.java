class SearchRotatedArray {

    public static int search(int[] nums, int k) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == k)
                return mid;

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

        return -1;
    }
}