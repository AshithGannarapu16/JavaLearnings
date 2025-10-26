public class tab {
    public int fibonacci_tabulation(int n) {
        if (n <= 1) {
            return n;
        }

        // DP array to store results up to F(n)
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 0;
        dp[1] = 1;

        // Fill the DP table iteratively
        for (int i = 2; i <= n; i++) {
            // Recurrence Relation: dp[i] = dp[i-1] + dp[i-2]
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // The result is the last element
        return dp[n];
    }

    public static void main(String[] args) {
        tab t = new tab();
        System.out.println("Fibonacci(6): " + t.fibonacci_tabulation(6));
    }
    // Time Complexity: O(N)
    // Space Complexity: O(N)
}
