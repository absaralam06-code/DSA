import java.util.*;

public class FindError{

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        int[] result = findErrorNums(nums);

        System.out.println("Duplicate Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}