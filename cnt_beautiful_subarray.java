import java.util.*;

public class cnt_beautiful_subarray {
    public static long beautifulSubarrays(int[] nums) {
        long cnt = 0;
        int prexor = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            prexor ^= num;

            if (prexor == 0) {
                cnt++;
            }

            cnt += mp.getOrDefault(prexor, 0);

            mp.put(prexor, mp.getOrDefault(prexor, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(beautifulSubarrays(nums));
        sc.close();
    }
}