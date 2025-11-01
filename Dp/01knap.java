class Knap01 {
    // 0/1 Knapsack Problem using Dynamic Programming
    public static class Solution {
        public int knapSack(int W, int[] wt, int[] val, int n) {
            int[][] dp = new int[n + 1][W + 1];

            // Build the dp table
            for (int i = 1; i <= n; i++) {
                for (int w = 0; w <= W; w++) {
                    if (wt[i - 1] <= w) {
                        dp[i][w] = Math.max(dp[i - 1][w], val[i - 1] + dp[i - 1][w - wt[i - 1]]);
                    } else {
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }
            return dp[n][W];
        }
    }

    
}

                        