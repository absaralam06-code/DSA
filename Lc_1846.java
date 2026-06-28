import java.util.*;

public class Lc_1846{
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        arr[0] = 1;

        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);

            if (diff > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        return arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = maximumElementAfterDecrementingAndRearranging(arr);

        System.out.println("Maximum Element: " + ans);

        sc.close();
    }
}