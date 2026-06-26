import java.util.Scanner;

public class Main {

    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (nums[mid] == target)
                return true;

            if (nums[st] == nums[mid] && nums[mid] == nums[end]) {
                st++;
                end--;
                continue;
            }

            if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
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

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println(search(nums, target));

        sc.close();
    }
}