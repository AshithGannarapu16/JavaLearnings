public class minCost {

   private static int min(int a, int b, int c) {
      return Math.min(a, Math.min(b, c));
   }

   /* Returns cost of minimum cost path from (0,0) to (m, n) in mat[R][C]*/
   public int minCostRecursive(int[][] cost, int m, int n) {
      if(m == 0 && n == 0) return cost[0][0];
      if(m < 0 || n < 0) return Integer.MAX_VALUE;
      return cost[m][n] + min(minCostRecursive(cost,m-1, n), minCostRecursive(cost, m-1, n-1), minCostRecursive(cost, m, n-1));
   }

   public static int minCostDP(int[][] cost, int m, int n) {
      int[][] minCost = new int[m+1][n+1];
      minCost[0][0] = cost[0][0];

      for(int i=1; i <= m; ++i) {
         minCost[i][0] = cost[i][0] + minCost[i-1][0];
      }
      for(int j=1; j <= n; ++j) {
         minCost[0][j] = cost[0][j] + minCost[0][j-1];
      }

      for(int i=1; i <= m; ++i) {
         for(int j=1; j <= n; ++j) {
            minCost[i][j] = cost[m][n] + min(minCost[i-1][j], minCost[i-1][j-1], minCost[i][j-1]);
         }
      }
      return minCost[m][n];
   }

   /* Driver program to test above functions */
   public static void main(String args[])
   {
      int cost[][]= {{1, 2, 3},
              {4, 8, 2},
              {1, 5, 3}};
      System.out.println("minimum cost to reach (2,2) = " +
              minCostDP(cost,2,2));
   }
}