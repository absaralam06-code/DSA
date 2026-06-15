import java.util.Arrays;

public class Mindiff {

    public static int minimumDifference(int[] arr, int k) {
        if (k == 1) {
            return 0;
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int diff = arr[i + k - 1] - arr[i];
            min = Math.min(min, diff);
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7};
        int k = 2;

        int result = minimumDifference(arr, k);

        System.out.println("Minimum Difference: " + result);
    }
}