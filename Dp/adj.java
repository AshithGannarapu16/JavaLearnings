class AdjacencyMatrixGraph {
    private int numVertices;
    private boolean[][] adjMatrix;

    public AdjacencyMatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add an edge (undirected)
    public void addEdge(int i, int j) {
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true; // For undirected graph
        }
    }

    // Remove an edge (undirected)
    public void removeEdge(int i, int j) {
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false; // For undirected graph
        }
    }

    // Check if an edge exists
    public boolean hasEdge(int i, int j) {
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            return adjMatrix[i][j];
        }
        return false;
    }

    // Print the adjacency matrix
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(4); // 4 vertices
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        System.out.println("Adjacency Matrix representation:");
        graph.printGraph();

        System.out.println("\nDoes edge (0, 3) exist? " + graph.hasEdge(0, 3));
        System.out.println("Does edge (1, 3) exist? " + graph.hasEdge(1, 3));
    }
}