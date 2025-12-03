import java.util.*;

public class Sol {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

        // adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= A; i++) adj.add(new ArrayList<>());

        // indegree array (1-based)
        int indegree[] = new int[A + 1];

        // build graph
        for (int i = 0; i < B.size(); i++) {
            int u = B.get(i).get(0);
            int v = B.get(i).get(1);

            adj.get(u).add(v);
            indegree[v]++;
        }

        // min-heap for lexicographically smallest order
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i <= A; i++) {
            if (indegree[i] == 0) pq.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            int node = pq.poll();
            result.add(node);

            for (int nbr : adj.get(node)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0)
                    pq.add(nbr);
            }
        }

        // if not all nodes visited → not a DAG
        if (result.size() != A) return new ArrayList<>();

        return result;
    }

    public static void main(String[] args) {
        Sol sol = new Sol();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3)));
        edges.add(new ArrayList<>(Arrays.asList(2, 4)));
        edges.add(new ArrayList<>(Arrays.asList(3, 4)));

        ArrayList<Integer> result = sol.solve(4, edges);
        System.out.println(result); // Expected output: [1, 2, 3, 4] or [1, 3, 2, 4]
    }
}
