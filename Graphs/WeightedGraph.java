package com.Graphs;

import java.util.ArrayList;
import java.util.List;

class GraphEdge
{
	public int weight;
	public int source;
	public int destination;
	
	public GraphEdge(int source, int destination, int weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}
}

class Graph3
{
	private int vertices;
	public List<GraphEdge>[] adjacencyList;
	
	public Graph3(int vertices) {
		this.vertices = vertices;
		this.adjacencyList = new ArrayList[vertices];
		
		for (int i = 0; i < vertices; i++)
		      adjacencyList[i] = new ArrayList<>();
	}
	
	public void addDirectedEdge(int source, int destination, int weight)
	{
		GraphEdge edge = new GraphEdge(source, destination, weight);
		adjacencyList[source].add(edge);
	}
	
	public void addUndirectedEdge(int source, int destination, int weight)
	{
		GraphEdge edge1 = new GraphEdge(source, destination, weight);
		GraphEdge edge2 = new GraphEdge(destination, source, weight);
		
		adjacencyList[source].add(edge1);
		adjacencyList[destination].add(edge2);
	}
	
	public void removeDirectedEdge(int source, int destination)
	{
		for( GraphEdge edge : adjacencyList[source])
		{
			if(edge.destination == destination)  {
				adjacencyList[source].remove(edge);
				break;
			}
		}
	}
	
	public void removeUndirectedEdge(int source, int destination)
	{
		removeDirectedEdge(source, destination);
		removeDirectedEdge(destination, source);
	}
	
	public void getVertices() 
	{
		for(int i=0; i<adjacencyList.length; i++)
		{
			System.out.println("vertex "+i+" is connected to ");
			for( GraphEdge ge : adjacencyList[i])
			{
				System.out.println(ge.destination+" with the weight "+ge.weight);
			}
			System.out.println();
			System.out.println();
		}
	}	
}

public class WeightedGraph {

	public static void main(String[] args) {
		Graph3 graph = new Graph3(5);
		graph.addUndirectedEdge(0,1,4);
	    graph.addUndirectedEdge(0,4,6);
	    graph.addUndirectedEdge(1,4,1);
	    graph.addUndirectedEdge(1,3,7);
	    graph.addUndirectedEdge(4,2,8);
	    
	    graph.getVertices();
		

	}

}
