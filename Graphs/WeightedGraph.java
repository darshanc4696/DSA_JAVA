package com.Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

// Class representing an edge in the graph
class GraphEdge {
    private int weight;
    private int source;
    private int destination;

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
    
    public List<GraphEdge> kruskals(Graph3 graph)
    {
    	List<GraphEdge>[] vertices = graph.getVertices();
    	
        PriorityQueue<GraphEdge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));
    	
    	for(List<GraphEdge> edge : vertices)
    	{
    		priorityQueue.addAll(edge);
    	}
    	
    	List<GraphEdge> mst = new ArrayList<GraphEdge>();
    	Set<Integer> inmst = new HashSet<>();
    	
    	while(! priorityQueue.isEmpty())
    	{
    		GraphEdge curredge = priorityQueue.poll();
    		
    		int source = curredge.getSource();
    		int destination = curredge.getDestination();
    		
    		if(inmst.contains(source) && inmst.contains(destination)) continue;
    		
    		mst.add(curredge);
    		inmst.add(curredge.getSource());
    		inmst.add(curredge.getDestination());
    	}
    	
    	return mst;
    	
    }
    
    
}

class GraphColouring
{
	public Map<Integer, Integer> colorGraph(Graph3 graph)
	{
		List<GraphEdge>[] vertices = graph.getVertices();
		Map<Integer, Integer> colourMap = new HashMap<>();
		
		for(int vertex = 0; vertex < vertices.length; vertex++)
		{
			Set<Integer> neighbourColours = new HashSet<>();
			for(GraphEdge edge : vertices[vertex])
			{
				if(colourMap.containsKey(edge.getDestination()))
				{
					neighbourColours.add(colourMap.get(edge.getDestination()));
				}
			}
			
			int color = 1;
			while(neighbourColours.contains(color))
			{
				color++;
			}
			
			colourMap.put(vertex, color);
		}
		
		return colourMap;
	}
} 

public class WeightedGraph {
    public static void main(String[] args) {
        MinimumSpanningTree mst = new MinimumSpanningTree();
        GraphColouring gc = new GraphColouring();
        Graph3 graph = new Graph3(7); // Updated to ensure all vertices are connected

        // Adding edges to the graph to make sure it's connected
        graph.addUndirectedEdge(0, 1, 2);
        graph.addUndirectedEdge(0, 2, 5);
        graph.addUndirectedEdge(0, 4, 3);
        graph.addUndirectedEdge(1, 4, 1);
        graph.addUndirectedEdge(1, 2, 4);
        graph.addUndirectedEdge(2, 3, 8);
        graph.addUndirectedEdge(2, 6, 7);
        graph.addUndirectedEdge(4, 5, 9);
        graph.addUndirectedEdge(4, 6, 1);
        graph.addUndirectedEdge(3, 6, 2);
        graph.addUndirectedEdge(3, 6, 2);

        // Calculating MST
//        List<GraphEdge> primsMST = mst.kruskals(graph);

        // Displaying the MST
//        graph.display(primsMST);
        
        Map<Integer, Integer> colorGraph = gc.colorGraph(graph);
        
        for(Map.Entry<Integer, Integer> entry : colorGraph.entrySet())
        {
        	System.out.println(entry.getKey() +" "+ entry.getValue());
        }
        
        
    }
}

