import java.util.Scanner;

public class Conca_array_rev {

    public static int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            arr[n + j] = nums[i];
            j++;
        }

        return arr;
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

        int[] result = concatWithReverse(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}