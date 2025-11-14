package m5b.d1ca;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private final int vertices; // Number of vertices
    private final List<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++)
            adjList[i] = new LinkedList<>();
    }
  // Add an undirected edge between src and dest
    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u); // undirected
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjList[vertex];
    }

    public int getVertices() {
        return vertices;
    }

    // Print the adjacency list for each vertex
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " connects to: ");
            for (int neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}