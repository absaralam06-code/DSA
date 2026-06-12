import java.util.*;

public class HeightChecker {

    public static int heightChecker(int[] nums) {
        int n = nums.length;
        int cnt = 0;

        int[] ans = new int[n];

        // Copy original array
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }

        // Sort the array
        Arrays.sort(nums);

        // Count mismatched positions
        for (int i = 0; i < n; i++) {
            if (ans[i] != nums[i]) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = heightChecker(nums);

        System.out.println("Number of students not in expected positions: " + result);

        sc.close();
    }
}