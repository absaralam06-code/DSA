import java.util.*;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int temp = x;
        int revnum = 0;

        while (x != 0) {
            int rem = x % 10;
            revnum = revnum * 10 + rem;
            x = x / 10;
        }

        return temp == revnum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}