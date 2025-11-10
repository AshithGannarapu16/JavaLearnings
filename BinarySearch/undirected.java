public public class UndirectedUnweightedGraphMatrix {
    int[][] adjacencyMatrix;
    int n;

    public UndirectedUnweightedGraphMatrix(int n) {
        this.n = n;
        adjacencyMatrix = new int[n + 1][n + 1];
    }

    public void addEdge(int u, int v) {
        adjacencyMatrix[u][v] = 1;
        adjacencyMatrix[v][u] = 1;
    }

    public void printMatrix() {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
} undirected {
    
}
