import java.util.*;

public class Find_missing_repeating {

    public static int[] findMissingAndRepeating(int[][] nums) {

        int n = nums.length;
        long N = (long) n * n;

        long SN = (N * (N + 1)) / 2;
        long S2N = (N * (N + 1) * (2 * N + 1)) / 6;

        long S = 0;
        long S2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                S += nums[i][j];
                S2 += (long) nums[i][j] * nums[i][j];
            }
        }

        long val1 = S - SN;      // x - y
        long val2 = S2 - S2N;    // x² - y²

        val2 = val2 / val1;      // x + y

        long x = (val1 + val2) / 2; // repeated
        long y = x - val1;          // missing

        return new int[]{(int) x, (int) y};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (size of n x n matrix): ");
        int n = sc.nextInt();

        int[][] nums = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        int[] ans = findMissingAndRepeating(nums);

        System.out.println("Repeated Number: " + ans[0]);
        System.out.println("Missing Number: " + ans[1]);

        sc.close();
    }
}