public class coinChange {

   // Returns the count of ways to sum coins S[0...m-1] to get sum n (recursive solution)
   public static int countRecursive(int[] S, int m, int n) {
      // If n is 0, there is 1 solution - no coin is chosen
      if(n == 0) return 1;

      // If n is negative, no solution
      if(n < 0) return 0;

      // If there are no coins but n is positive, no solution
      if(m <= 0 && n > 0) return 0;

      // Exclude the last coin + Include at least one of the last coin
      return countRecursive(S, m-1, n) + countRecursive(S, m, n - S[m-1]);
   }

   // Returns the count of ways to sum coins S[0...m-1] to get sum n using dynamic programming
   public static int countDP(int[] S, int m, int n) {
      int[][] dp = new int[m][n+1];

      // Base case: for sum 0, there's 1 way (choose no coin)
      for(int i = 0; i < m; i++) {
         dp[i][0] = 1;
      }

      // Fill dp in bottom up manner
      for(int i = 0; i < m; i++) {
         for(int j = 1; j <= n; j++) {
            int includeCoin = (j - S[i] >= 0) ? dp[i][j - S[i]] : 0;
            int excludeCoin = (i >= 1) ? dp[i-1][j] : 0;
            dp[i][j] = includeCoin + excludeCoin;
         }
      }

      return dp[m-1][n];
   }

   public static void main(String[] args) {
      int[] arr = {1, 3, 2};
      int m = arr.length;
      int n = 4;
      System.out.println(countDP(arr, m, n));  // Output: 4
   }
}

