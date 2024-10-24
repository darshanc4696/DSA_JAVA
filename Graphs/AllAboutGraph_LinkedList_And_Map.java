package com.Graphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
	
	public void graphTraversalDFS(int startvertex) {
		Set<Integer> visited = new LinkedHashSet<>();
		Stack<Integer> stack = new Stack<>();
		
		stack.add(startvertex);
		
		while(! stack.isEmpty()) {
			Integer currentvertex = stack.pop();
			visited.add(currentvertex);
			
			for(int neighbour : list.getOrDefault(currentvertex, Collections.emptyList())) {
				if(! visited.contains(neighbour)) {
					stack.add(neighbour);
				}
			}
		}
		
		for(int i : visited) {
			System.out.print(i+" ");
		}
	}
	
	public void graphTraversalBFS(int startVertex) {
		Set<Integer> visited = new LinkedHashSet<>();
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(startVertex);
		
		while(! queue.isEmpty()) {
			Integer currVertex = queue.poll();			
			visited.add(currVertex);
			
			for(Integer i : list.getOrDefault(currVertex, Collections.emptyList())) {
				if(! visited.contains(i)) {
					queue.add(i);
				}
			}
		}
		
		for(int i : visited) {
			System.out.print(i+" ");
		}
	}
}

public class AllAboutGraph_LinkedList_And_Map {

	public static void main(String[] args) {
		Graph1 graph = new Graph1();
		
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(3, 6);
		graph.addEdge(4, 5);
		
//		graph.display();
//		
//		graph.removeEdge(2, 4);
//		
//		graph.display();
//		
//		graph.removeVertex(2);

//		graph.display();
		graph.graphTraversalBFS(1);
	}

}
