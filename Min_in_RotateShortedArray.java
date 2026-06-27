import java.util.Scanner;

public class Min_in_RotateShortedArray {

    public static int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (nums[st] <= nums[end]) {
                ans = Math.min(ans, nums[st]);
                break;
            }

            if (nums[st] <= nums[mid]) {
                ans = Math.min(ans, nums[st]);
                st = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Minimum element: " + findMin(nums));

        sc.close();
    }
}