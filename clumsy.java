import java.util.Scanner;

public class clumsy {

    static int cnt;
    static int ans;
    static int fact;

    public static int clumsyFactorial(int n) {
        cnt = -1;
        ans = 0;
        solve(n);
        return ans + fact;
    }

    private static void solve(int n) {
        if (n == 0) {
            return;
        }

        if (cnt == -1) {
            fact = n;
            cnt++;
        } 
        else if (cnt == 0) {
            fact *= n;
            cnt++;
        } 
        else if (cnt == 1) {
            fact /= n;
            cnt++;
        } 
        else if (cnt == 2) {
            ans += fact;
            fact = n;
            cnt++;
        } 
        else {
            ans += fact;
            fact = -n;
            cnt = 0;
        }

        solve(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Clumsy Factorial = " + clumsyFactorial(n));

        sc.close();
    }
}