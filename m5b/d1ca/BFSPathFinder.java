package m5b.d1ca;

import java.util.*;

public class BFSPathFinder {
// Class to perform Breadth-First Search (BFS) for finding shortest path
    private final Graph graph;

// Constructor that receives the Graph object
    public BFSPathFinder(Graph graph) {
        this.graph = graph;
    }
// Method to find and print the shortest path from 'start' to 'end' vertex
    public void printShortestPath(int start, int end) {
        boolean[] visited = new boolean[graph.getVertices()];
        int[] parent = new int[graph.getVertices()];
        Arrays.fill(parent, -1);
// BFS queue
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
// Standard BFS loop
        while (!queue.isEmpty()) {
            int current = queue.poll();
  // Stop if we reached the destination
            if (current == end) break;
// Check all neighbors of current vertex
            for (int neighbor : graph.getNeighbors(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                    queue.add(neighbor);
                }
            }
        }
// Reconstruct the path from end to start using parent array
        List<Integer> path = new ArrayList<>();
        for (int at = end; at != -1; at = parent[at])
            path.add(at);
        Collections.reverse(path);
 // If the first node is not the start node, then no path was found
        if (path.get(0) != start) {
            System.out.println("No path found.");
        } else {
 // Otherwise, print the shortest path
            System.out.println("Shortest path: " + path);
        }
    }
}