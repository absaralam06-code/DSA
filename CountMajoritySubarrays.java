import java.util.Scanner;

public class CountMajoritySubarrays {

    public static int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    x++;
                }

                int len = j - i + 1;

                if (x > len / 2) {
                    count++;
                }
            }
        }

        return count;
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

        int ans = countMajoritySubarrays(nums, target);

        System.out.println("Number of majority subarrays = " + ans);

        sc.close();
    }
}