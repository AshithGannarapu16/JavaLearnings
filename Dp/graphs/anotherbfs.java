import java.util.*;

public class anotherbfs {
    // Usage (stdin):
    // n m
    // m lines: u v   (1-based node indices, undirected)
    // s           (starting node)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) g[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            if (u >= 0 && u <= n && v >= 0 && v <= n) {
                g[u].add(v);
                g[v].add(u);
            }
        }

        int s = sc.nextInt();
        bfs(g, n, s);
    }

    static void bfs(List<Integer>[] g, int n, int s) {
        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(dist, -1);
        Arrays.fill(parent, -1);

        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        dist[s] = 0;

        List<Integer> order = new ArrayList<>();
        while (!q.isEmpty()) {
            int u = q.poll();
            order.add(u);
            for (int v : g[u]) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    parent[v] = u;
                    q.add(v);
                }
            }
        }

        // print BFS visit order
        StringJoiner sj = new StringJoiner(" ");
        for (int x : order) sj.add(Integer.toString(x));
        System.out.println("BFS order: " + sj.toString());

        // print distances (index 1..n)
        StringJoiner sd = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) sd.add(Integer.toString(dist[i]));
        System.out.println("Distances: " + sd.toString());

        // print parent array
        StringJoiner sp = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) sp.add(Integer.toString(parent[i]));
        System.out.println("Parents: " + sp.toString());
    }
}