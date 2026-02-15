public class undirected {
    private final int[][] adjacencyMatrix; // Use private for encapsulation
    private final int n;

    public undirected(int n) {
        this.n = n;
        // n+1 allows for 1-based indexing of nodes
        adjacencyMatrix = new int[n + 1][n + 1];
    }

    public void addEdge(int u, int v) {
        // Basic range check to prevent crashes
        if (u >= 1 && u <= n && v >= 1 && v <= n) {
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1; // Symmetric for undirected
        }
    }

    public void printMatrix() {
        // Start from 1 to skip the unused 0th index if using 1-based indexing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
