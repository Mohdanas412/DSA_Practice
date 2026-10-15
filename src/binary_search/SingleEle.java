import java.util.Scanner;

public class SingleEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = nums[0];

        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                ans = nums[i];
                break;
            }
            ans = nums[n - 1];
        }

        System.out.println(ans);
        sc.close();
    }
}