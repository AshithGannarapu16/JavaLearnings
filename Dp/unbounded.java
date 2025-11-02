public class UnboundedKnapsack {
    public static int unboundedKnapsack(int W, int[] wt, int[] val, int n) {
        // Create a DP array to store maximum values for each weight
        int[] dp = new int[W + 1];

        // Iterate through all weights from 0 to W
        for (int i = 0; i <= W; i++) {
            for (int j = 0; j < n; j++) {
                if (wt[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - wt[j]] + val[j]);
                }
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        int W = 100; // Maximum weight capacity of the knapsack
        int[] wt = {1, 50}; // Weights of items
        int[] val = {1, 30}; // Values of items
        int n = wt.length;

        System.out.println("Maximum value: " + unboundedKnapsack(W, wt, val, n));
    }
}
