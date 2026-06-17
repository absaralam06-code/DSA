import java.util.Scanner;

class Solution {
    public int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }
}

public class Leetcode_2769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.print("Enter t: ");
        int t = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.theMaximumAchievableX(num, t);

        System.out.println("Maximum Achievable Number = " + result);

        sc.close();
    }
}