package com.Graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph1
{
	Map<Integer, List<Integer>> list;
	
	public Graph1() {
		this.list = new HashMap<>();
	}
	
	public void addVertex(int vertex) {
		list.put(vertex, new LinkedList<>());
	}
	
	public void addEdge(int source, int destination) {
		list.get(source).add(destination);
		list.get(destination).add(source);
	}
	
	public void removeVertex(int vertex) {
		list.remove((Integer) vertex);
		
		for(List<Integer> l : list.values()) {
			l.remove((Integer)vertex);
		}
	}
	
	public void removeEdge(int source, int destination) {
		list.get(source).remove((Integer)destination);
		list.get(destination).remove((Integer)source);
	}
	
	public void display() {
		
		for(Map.Entry<Integer, List<Integer>> entry : list.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

public class AllAbiutGraph_LinkedList_And_Map {

	public static void main(String[] args) {
		Graph1 graph = new Graph1();
		
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		
		graph.display();
		
		graph.removeEdge(2, 4);
		
		graph.display();
		
		graph.removeVertex(2);

		graph.display();
	}

}
