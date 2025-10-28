import java.util.Arrays;

public class MinSquare {
    public class Solution {
    int[] dp;

    public int countMinSquares(int A) {
        dp = new int[A + 1];
        Arrays.fill(dp, -1);
        return countMinSquaresHelper(A);
    }

    private int countMinSquaresHelper(int A) {
        if (A == 0) return 0;
        if (A == 1) return 1;
        if (dp[A] != -1) return dp[A];

        int minSqu = Integer.MAX_VALUE;
        int i = 1;
        while (A - i * i >= 0) {
            int ans = countMinSquaresHelper(A - i * i);
            i++;
            if (ans + 1 < minSqu) {
                minSqu = ans + 1;
            }
        }
        dp[A] = minSqu;
        return minSqu;
    }
}
    // Simple main to run with input from stdin.
    // Input format:
    // A
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            if (!sc.hasNextInt()) {
                System.out.println("No input provided. Expected: A");
                return;
            }

            int A = sc.nextInt();

            Solution sol = new MinSquare().new Solution();
            int ans = sol.countMinSquares(A);
            System.out.println(ans);
        } finally {
            sc.close();
        }
    }
}
