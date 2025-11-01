public class KnapsackZeroOne {
    // 0/1 Knapsack Problem using Dynamic Programming
    public static class Solution {
        public int knapSack(int W, int[] wt, int[] val, int n) {
            if (W <= 0 || n <= 0 || wt == null || val == null || wt.length != n || val.length != n) {
                return 0;
            }

            int[][] dp = new int[n + 1][W + 1];

            // Build the dp table
            for (int i = 1; i <= n; i++) {
                for (int w = 0; w <= W; w++) {
                    if (wt[i - 1] <= w) {
                        // Include current item or exclude it
                        dp[i][w] = Math.max(dp[i - 1][w], val[i - 1] + dp[i - 1][w - wt[i - 1]]);
                    } else {
                        // Can't include current item, take previous solution
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }

            return dp[n][W];
        }

        // Space optimized version using 1D array
        public int knapSackOptimized(int W, int[] wt, int[] val, int n) {
            if (W <= 0 || n <= 0 || wt == null || val == null || wt.length != n || val.length != n) {
                return 0;
            }

            int[] dp = new int[W + 1];

            // Process all items
            for (int i = 0; i < n; i++) {
                // Process weights from right to left to avoid overwriting needed values
                for (int w = W; w >= wt[i]; w--) {
                    dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
                }
            }

            return dp[W];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        int[][] testCases = {
            // W, n
            {10, 4}, // Test case 1
            {50, 3}, // Test case 2
            {7, 3},  // Test case 3
        };

        int[][] weights = {
            {2, 3, 4, 5},     // Test case 1
            {10, 20, 30},      // Test case 2
            {1, 3, 4},        // Test case 3
        };

        int[][] values = {
            {3, 4, 5, 6},     // Test case 1
            {60, 100, 120},    // Test case 2
            {1, 4, 5},        // Test case 3
        };

        for (int t = 0; t < testCases.length; t++) {
            int W = testCases[t][0];
            int n = testCases[t][1];
            int[] wt = weights[t];
            int[] val = values[t];

            int result = sol.knapSack(W, wt, val, n);
            int resultOpt = sol.knapSackOptimized(W, wt, val, n);

            System.out.println("\nTest Case " + (t + 1) + ":");
            System.out.println("Capacity (W): " + W);
            System.out.print("Weights: ");
            for (int w : wt) System.out.print(w + " ");
            System.out.print("\nValues:  ");
            for (int v : val) System.out.print(v + " ");
            System.out.println("\nMaximum value: " + result);
            
            if (result != resultOpt) {
                System.out.println("Warning: Optimized solution mismatch!");
                System.out.println("Optimized result: " + resultOpt);
            }
        }
    }
}