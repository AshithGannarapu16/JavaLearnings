import java.util.ArrayList;
import java.util.List;

class GraphDFS {
    private int V; // Number of vertices
    private List<List<Integer>> adj; // Adjacency list

    public GraphDFS(int v) {
        V = v;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; ++i) {
            adj.add(new ArrayList<>());
        }
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w) {
        adj.get(v).add(w);
        // For undirected graph, also add adj.get(w).add(v);
    }

    // A utility function to perform DFS
    // from a given source vertex s.
    // It uses visited[] to keep track of visited vertices.
    private void DFSUtil(int s, boolean[] visited, List<Integer> result) {
        visited[s] = true;
        result.add(s); // Add current node to traversal result

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adj.get(s)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited, result);
            }
        }
    }

    // The function to do DFS traversal.
    // It uses recursive DFSUtil()
    public List<Integer> DFS(int startNode) {
        boolean[] visited = new boolean[V];
        List<Integer> result = new ArrayList<>();
        DFSUtil(startNode, visited, result);
        return result;
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("DFS traversal starting from vertex 2:");
        List<Integer> traversal = g.DFS(2);
        System.out.println(traversal); // Expected: [2, 0, 1, 3] (order may vary based on adjacency list iteration)
    }
}