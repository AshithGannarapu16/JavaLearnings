import java.util.PriorityQueue;


public class Solution {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : A) pq.add(x);

        long total = 0;

        while (!pq.isEmpty() && pq.peek() <= B) {

            int min = pq.poll();          // smallest box
            int mishaEat = min / 2;       // she eats half (floor)
            int remain = min - mishaEat;  // remaining candies

            total += mishaEat;

            pq.add(remain);               // ALWAYS add back the remaining
        }

        return (int) total;
    }
}
