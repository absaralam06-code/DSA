import java.util.*;

public class FourSum {

    public static List<List<Integer>> Foursum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                Set<Long> hashset = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long fourth = (long) target
                            - (long) nums[i]
                            - (long) nums[j]
                            - (long) nums[k];

                    if (hashset.contains(fourth)) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);

                        Collections.sort(temp);
                        st.add(temp);
                    }

                    hashset.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        List<List<Integer>> result = Foursum(nums, target);

        System.out.println("Quadruplets:");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }

        sc.close();
    }
}