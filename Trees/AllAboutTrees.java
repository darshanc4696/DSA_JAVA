package com.Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}


class Trees
{
	static void inorderTraversal(Node root)
	{
		if(root != null)
		{
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);
		}
	}
	
	static void preorderTraversal(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data+" ");
			inorderTraversal(root.left);
			inorderTraversal(root.right);
		}
	}
	
	static void postorderTraversal(Node root)
	{
		if(root != null)
		{
			inorderTraversal(root.left);
			inorderTraversal(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	static int heightOf(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int lh = heightOf(root.left);
			int rh = heightOf(root.right);
			return (lh > rh ? lh : rh) + 1;
		}
	}
	
	static void printNodesOf(Node root, int k)
	{
		if(root != null)
		{
			if(k == 0)
			{
				System.out.print(root.data+" ");
			}
			printNodesOf(root.left, k-1);
			printNodesOf(root.right, k-1);
		}
	}
	
	static void levelorderTraversal(Node root)
	{
		if(root != null)
		{
			Queue<Node> qt = new LinkedList<Node>();
			qt.add(root);

			while(qt.size() > 0)
			{
				Node removed = qt.poll();
				System.out.print(removed.data+" ");
				if(removed.left != null) qt.add(removed.left);
				if(removed.right != null) qt.add(removed.right);
			}
		}
	}
	
	static void levelorderTraversalLineByLine(Node root)
	{
		if(root != null)
		{
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			
			while(! queue.isEmpty())
			{
				int queueLen = queue.size();
				
				for(int i=0; i<queueLen; i++)
				{
					Node curr = queue.poll();
					System.out.print(curr.data+" ");
					if(curr.left != null) queue.add(curr.left);
					if(curr.right != null) queue.add(curr.right);
				}
				System.out.println();
			}
		}
	}
	
	static int sizeOf(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int ls = sizeOf(root.left);
			int rs = sizeOf(root.right);
			return ls+rs+1;
		}
	}
	
	static int maxOf(Node root)
	{
		if(root == null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			int lm = maxOf(root.left);
			int rm = maxOf(root.right);
			
			return Math.max(Math.max(lm, rm), root.data);
		}
	}
	
	
	
	
}


public class AllAboutTrees {
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(30);
		root.right = new Node(40);
		root.right.left = new Node(50);
		root.right.right = new Node(60);
		root.left.left.left = new Node(70);
		root.left.left.right = new Node(80);
		
		Trees.levelorderTraversalLineByLine(root);
		
	}

}
