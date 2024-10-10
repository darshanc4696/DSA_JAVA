package com.Trees;


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
}


public class AllAboutTrees {
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(30);
		root.right = new Node(40);
		root.right.left = new Node(50);
		root.right.right = new Node(60);
		
		Trees.inorderTraversal(root);
		
	}

}
