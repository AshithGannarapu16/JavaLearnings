public class uniquePath {
    // Make Solution static for easier instantiation
    public static class Solution {
        public int uniquePaths(int A, int B) {
            if (A <= 0 || B <= 0) return 0;
            
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
            
            return dp[A - 1][B - 1];
        }
    }

    // Simple main to run with input from stdin.
    public static void main(String[] args) {
        Solution solution = new Solution(); // Simpler instantiation now
        
        // Test cases
        int[][] tests = {
            {3, 3},  // 3x3 grid
            {2, 3},  // 2x3 grid
            {3, 7},  // 3x7 grid
            {7, 3}   // 7x3 grid
        };
        
        System.out.println("Testing unique paths for different grid sizes:");
        for (int[] test : tests) {
            int A = test[0], B = test[1];
            int paths = solution.uniquePaths(A, B);
            System.out.printf("%dx%d grid: %d unique paths%n", A, B, paths);
        }
    }
}
