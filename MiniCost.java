import java.util.Arrays;
import java.util.Scanner;

public class MiniCost {

    public static int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);

        int num = 0;
        int j = n - 1;

        while (j >= 2) {
            int i = j - 1;
            num += cost[i] + cost[j];
            j -= 3;
        }

        // Add remaining 1 or 2 candies
        while (j >= 0) {
            num += cost[j];
            j--;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candies: ");
        int n = sc.nextInt();

        int[] cost = new int[n];

        System.out.println("Enter candy costs:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int result = minimumCost(cost);

        System.out.println("Minimum Cost = " + result);

        sc.close();
    }
}