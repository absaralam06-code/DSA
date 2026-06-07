import java.util.*;

public class ThreeSum {
    // most optimal Approach !!
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return ans;
    }
/* 2nd optimal
public static List<List<Integer>> threeSum2(int[] nums) {
    Set<List<Integer>> st = new HashSet<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
        Set<Integer> hashset = new HashSet<>();

        for (int j = i + 1; j < n; j++) {
            int third = -(nums[i] + nums[j]);

            if (hashset.contains(third)) {
                List<Integer> temp = new ArrayList<>();

                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(third);

                Collections.sort(temp);
                st.add(temp);
            }

            hashset.add(nums[j]);
        }
    }

    List<List<Integer>> ans = new ArrayList<>(st);
    return ans;
}*/ 

/* brute force
 public static List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> st = new HashSet<>();

    int n = nums.length;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {

                if (nums[i] + nums[j] + nums[k] == 0) {

                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    Collections.sort(temp);
                    st.add(temp);
                }
            }
        }
    }

    return new ArrayList<>(st);
}*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = threeSum(nums);

        System.out.println("Triplets:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

        sc.close();
    }
}