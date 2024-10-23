package com.Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

// Class representing an edge in the graph
class GraphEdge {
    public int weight;
    public int source;
    public int destination;

    public GraphEdge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }
}

// Graph class supporting directed and undirected edges
class Graph3 {
    private int vertices;
    public List<GraphEdge>[] adjacencyList;

    public Graph3(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++)
            adjacencyList[i] = new ArrayList<>();
    }

    // Add directed edge
    public void addDirectedEdge(int source, int destination, int weight) {
        GraphEdge edge = new GraphEdge(source, destination, weight);
        adjacencyList[source].add(edge);
    }

    // Add undirected edge
    public void addUndirectedEdge(int source, int destination, int weight) {
        GraphEdge edge1 = new GraphEdge(source, destination, weight);
        GraphEdge edge2 = new GraphEdge(destination, source, weight);
        adjacencyList[source].add(edge1);
        adjacencyList[destination].add(edge2);
    }

    // Get all vertices
    public List<GraphEdge>[] getVertices() {
        return adjacencyList;
    }

    // Display the list of edges
    public void display(List<GraphEdge> graph) {
        if (graph.isEmpty()) {
            System.out.println("No edges found in the Minimum Spanning Tree.");
        } else {
            System.out.println("Edges in the Minimum Spanning Tree:");
            for (GraphEdge g : graph) {
                System.out.println("Source: " + g.getSource() + " - Destination: " + g.getDestination() + " - Weight: " + g.getWeight());
            }
        }
    }
}

// Class for calculating the Minimum Spanning Tree using Prim's algorithm
class MinimumSpanningTree {
    public List<GraphEdge> prims(Graph3 graph) {
        List<GraphEdge>[] vertices = graph.getVertices();
        boolean[] inMST = new boolean[vertices.length];
        PriorityQueue<GraphEdge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));
        List<GraphEdge> mst = new ArrayList<>();

        int startVertex = 0; // Start from the first vertex
        inMST[startVertex] = true;
        priorityQueue.addAll(vertices[startVertex]);

        System.out.println("Starting Prim's algorithm...");

        while (!priorityQueue.isEmpty()) {
            GraphEdge edge = priorityQueue.poll();
            int destination = edge.getDestination();

            // If the vertex is already in the MST, skip
            if (inMST[destination]) continue;

            // Add edge to the MST
            mst.add(edge);
            System.out.println("Added edge: " + edge.getSource() + " -> " + edge.getDestination() + " with weight " + edge.getWeight());

            inMST[destination] = true;

            // Add all edges from the newly added vertex to the queue
            for (GraphEdge adjacentEdge : vertices[destination]) {
                if (!inMST[adjacentEdge.getDestination()]) {
                    priorityQueue.add(adjacentEdge);
                }
            }
        }

        if (mst.size() < vertices.length - 1) {
            System.out.println("The graph is not connected, so a Minimum Spanning Tree cannot be formed.");
        }

        return mst;
    }
}

// Main class to test the MST calculation
public class WeightedGraph {
    public static void main(String[] args) {
        MinimumSpanningTree mst = new MinimumSpanningTree();
        Graph3 graph = new Graph3(8); // Updated to ensure all vertices are connected

        // Adding edges to the graph to make sure it's connected
        graph.addUndirectedEdge(0, 1, 4);
        graph.addUndirectedEdge(0, 2, 3);
        graph.addUndirectedEdge(1, 2, 1);
        graph.addUndirectedEdge(1, 3, 2);
        graph.addUndirectedEdge(2, 3, 4);
        graph.addUndirectedEdge(3, 4, 2);
        graph.addUndirectedEdge(4, 5, 6);
        graph.addUndirectedEdge(5, 6, 3);
        graph.addUndirectedEdge(6, 7, 4);
        graph.addUndirectedEdge(4, 7, 3);

        // Calculating MST
        List<GraphEdge> primsMST = mst.prims(graph);

        // Displaying the MST
        graph.display(primsMST);
    }
}

