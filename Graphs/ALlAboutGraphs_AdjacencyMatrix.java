package com.Graphs;


class Graph
{
	int[][] adjMatrix;
	int vertices;
	
	public Graph(int vertices) {
		this.adjMatrix = new int[vertices][vertices];
		this.vertices = vertices;
	}
	
	public void addEdge(int i, int j) {
		adjMatrix[i][j] = 1;
		adjMatrix[j][i] = 1;
	}
	
	public void removeEdge(int i, int j) {
		adjMatrix[i][j] = 0;
		adjMatrix[j][i] = 0;
	}
	
	public void addVertex(int v) {
		int[][] newMatrix = new int[vertices+1][vertices+1];
		
		for(int i=0; i<vertices; i++) {
			for(int j=0; j<vertices; j++) {
				newMatrix[i][j] = adjMatrix[i][j];
			}
		}
		
		adjMatrix = newMatrix;
		vertices++;
	}
	
	public void removeVertex(int v) {
		if(vertices > 0) {
			int[][] newMatrix = new int[vertices-1][vertices-1];
			
			for(int i=0; i<vertices; i++) {
				for(int j=0; j<vertices; j++) {
					if(i != v && j != v)
					{
						int tempi = i<v? i : i-1;
						int tempj = j<v? j : j-1;
						newMatrix[tempi][tempj] = adjMatrix[i][j];
					}
				}
			}
			
			adjMatrix = newMatrix;
			vertices--;
		}
	}
	
	public void display()
	{
		for(int i=0; i<vertices; i++) {
			for(int j=0; j<vertices; j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class ALlAboutGraphs_AdjacencyMatrix {

	public static void main(String[] args) {
		
		Graph graph = new Graph(3);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		
		graph.display();
		System.out.println();
		graph.removeVertex(1);
		graph.display();
		

	}
}
