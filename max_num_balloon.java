import java.util.Scanner;

public class max_num_balloon {

    public static int max_num_balloon_count(String text) {
        int[] arr = new int[26];

        for (char ch : text.toCharArray()) {
            arr[ch - 'a']++;
        }

        int num = Math.min(arr[0], Math.min(arr[1], arr[13]));
        num = Math.min(num, arr[11] / 2);
        num = Math.min(num, arr[14] / 2);

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println("Maximum number of balloons = " +
                           max_num_balloon_count(text));

        sc.close();
    }
}