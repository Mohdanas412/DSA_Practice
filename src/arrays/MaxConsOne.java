import java.util.*;

class MaxConsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0, max = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}