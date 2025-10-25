import java.util.*;

public class countRectangle {

    // Helper solution class (static so it can be used from main)
    public static class Solution {
        // Count number of pairs (i < j) such that A[i] * A[j] < B
        public int solve(int[] A, int B) {
            if (A == null || A.length < 2) return 0;

            // Defensive: ensure array is sorted ascending
            Arrays.sort(A);

            int n = A.length;
            long count = 0L;
            final int MOD = 1_000_000_007;

            int left = 0, right = n - 1;

            // Two-pointer: when A[left] * A[right] < B,
            // then for current left, all indices from left+1..right form valid pairs -> (right-left)
            while (left < right) {
                long prod = (long) A[left] * A[right];
                if (prod < B) {
                    count = (count + (right - left)) % MOD;
                    left++;
                } else {
                    right--;
                }
            }

            return (int) count;
        }
    }

    // Simple main to run with input from stdin.
    // Input format:
    // n
    // a1 a2 ... an
    // B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (!sc.hasNextInt()) {
                System.out.println("No input provided. Expected: n, array elements, B");
                return;
            }

            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Insufficient array elements provided");
                    return;
                }
                A[i] = sc.nextInt();
            }

            if (!sc.hasNextInt()) {
                System.out.println("Missing B value");
                return;
            }
            int B = sc.nextInt();

            Solution sol = new Solution();
            int ans = sol.solve(A, B);
            System.out.println(ans);
        } finally {
            sc.close();
        }
    }

}