import java.util.Scanner;

public class Lc_1967 {

    public static int numOfStrings(String[] patterns, String word) {
        int cnt = 0;

        for (String s : patterns) {
            if (word.contains(s)) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patterns: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] patterns = new String[n];

        System.out.println("Enter the patterns:");
        for (int i = 0; i < n; i++) {
            patterns[i] = sc.nextLine();
        }

        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        int ans = numOfStrings(patterns, word);

        System.out.println("Answer: " + ans);

        sc.close();
    }
}