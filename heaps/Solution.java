import java.util.*;

public class Solution {
    public int[] solve(int[][] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            int P = A[i][0];
            int Q = A[i][1];

            if (P == 1 && Q == -1) {
                if (minHeap.isEmpty()) {
                    res.add(-1);
                } else {
                    res.add(minHeap.poll());
                }
            } else if (P == 2) {
                minHeap.add(Q);
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] A = {
            {2, 5},
            {2, 3},
            {1, -1},
            {2, 7},
            {1, -1},
            {1, -1}
        };
        int[] result = sol.solve(A);
        System.out.println(Arrays.toString(result)); // Output: [3, 5, 7]
    }
}