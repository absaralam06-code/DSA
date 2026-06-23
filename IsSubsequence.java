import java.util.Scanner;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int i = 0;
        int j = 0;

        while (i < len1 && j < len2) {
            char a = s.charAt(i);
            char b = t.charAt(j);

            if (a == b) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if (i >= len1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter t: ");
        String t = sc.nextLine();

        boolean result = isSubsequence(s, t);
        System.out.println(result);

        sc.close();
    }
}