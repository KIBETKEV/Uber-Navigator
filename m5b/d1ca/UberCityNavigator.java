package m5b.d1ca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UberCityNavigator {

    public static void main(String[] args) {
        System.out.println("Program: Uber City Navigator");
        System.out.println("Author: Kelvin Ngeno");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date of Execution: " + now.format(formatter));
  // Create a graph with 6 vertices
        Graph cityGraph = new Graph(6);
        cityGraph.addEdge(0, 1);
        cityGraph.addEdge(0, 2);
        cityGraph.addEdge(1, 3);
        cityGraph.addEdge(2, 4);
        cityGraph.addEdge(3, 5);

        // Display the graph structure
        System.out.println("\nGraph connections:");
        cityGraph.printGraph();

        BFSPathFinder finder = new BFSPathFinder(cityGraph);
        int source = 0;
        int destination = 5;
// Perform BFS to find shortest route from pickup (0) to drop-off (5)
        System.out.println("\nFinding shortest path from " + source + " to " + destination + ":");
        finder.printShortestPath(source, destination);
    }
}