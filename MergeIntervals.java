import java.util.*;

public class MergeIntervals {

    static int[][] Merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0]-b[0]);
        int n = arr.length;
        int[][] ans = new int[n][2];
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (idx == -1 || arr[i][0] > ans[idx][1]) {
                ans[++idx] = arr[i];
            } else {
                ans[idx][1] = Math.max(ans[idx][1], arr[i][1]);
            }
        }
        return Arrays.copyOf(ans, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] res = Merge(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}

/*
Output : 
Enter number of rows: 4
Enter number of columns: 2
1 5
2 8
10 15
12 19

1 8
10 19
 */