import java.util.*;

public class Heap1 {
    public static class Solution {
        public int solve(ArrayList<Integer> A) {
            if (A == null || A.size() == 0) return 0;

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int rope : A) {
                minHeap.offer(rope);
            }
            int totalCost = 0;
            while (minHeap.size() > 1) {
                int first = minHeap.poll();
                int second = minHeap.poll();

                int cost = first + second;
                totalCost += cost;
                minHeap.offer(cost);
            }
            return totalCost;
        }
    }
}
