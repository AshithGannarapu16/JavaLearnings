import java.util.*;

public class rotten {
    public class Solution {
        class pair{
            int i, j, time;

            pair(int x, int y, int t){
                this.i = x;
                this.j = y;
                this.time = t;
            }
        }
        public static void main(String[] args) {
            Solution sol = new rotten().new Solution();
            int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
            };
            System.out.println("Time taken: " + sol.solve(grid));
        }
        public int solve(int[][] A) {
            if (A == null || A.length == 0) return -1;
            int N = A.length;
            int M = A[0].length;
            int minTime = 0, fresh = 0;
            Queue<pair> q = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (A[i][j] == 2) {
                        q.offer(new pair(i, j, 0));
                    } else if (A[i][j] == 1) {
                        fresh++;
                    }
                }
            }

            int[] dr = {-1, 0, 1, 0};
            int[] dc = {0, 1, 0, -1};

            while (!q.isEmpty()) {
                pair rem = q.remove();
                minTime = Math.max(minTime, rem.time);
                for (int d = 0; d < 4; d++) {
                    int nr = rem.i + dr[d];
                    int nc = rem.j + dc[d];
                    if (nr >= 0 && nr < N && nc >= 0 && nc < M && A[nr][nc] == 1) {
                        A[nr][nc] = 2;
                        fresh--;
                        q.offer(new pair(nr, nc, rem.time + 1));
                    }
                }
            }
            return (fresh == 0) ? minTime : -1;
        }
    }

}
