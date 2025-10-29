import java.util.*;

public class uniquePath_new {
    public static class Solution {
        public int uniquePaths(int A, int B) {
            int[][] dp = new int[A][B];

            // Base case: first row and first column
            for (int i = 0; i < A; i++) {
                dp[i][0] = 1;
            }
            for (int j = 0; j < B; j++) {
                dp[0][j] = 1;
            }

            // Fill the dp table
            for (int i = 1; i < A; i++) {
                for (int j = 1; j < B; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }

            return dp[A-1][B-1];
        }

        // Space-optimized O(n) solution
        public int uniquePathsOptimized(int A, int B) {
            int[] dp = new int[B];
            Arrays.fill(dp, 1);
            
            for (int i = 1; i < A; i++) {
                for (int j = 1; j < B; j++) {
                    dp[j] += dp[j-1];
                }
            }
            
            return dp[B-1];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test cases
        int[][] tests = {
            {3, 7},  // 3x7 grid
            {3, 2},  // 3x2 grid
            {7, 3},  // 7x3 grid
            {3, 3}   // 3x3 grid
        };
        
        System.out.println("Testing unique paths for different grid sizes:");
        for (int[] test : tests) {
            int m = test[0], n = test[1];
            int paths = sol.uniquePaths(m, n);
            int pathsOpt = sol.uniquePathsOptimized(m, n);
            
            System.out.printf("%dx%d grid: %d unique paths%n", m, n, paths);
            // Verify optimized solution matches
            if (paths != pathsOpt) {
                System.out.println("Warning: Optimized solution mismatch!");
            }
        }
    }
}