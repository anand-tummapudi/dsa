package com.datastructures.trees;

import java.util.Stack;

public class BinaryTree {
	
	private TreeNode root;
	
	private class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	 }
	
	public void generateBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		this.root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b = new BinaryTree();
		b.generateBinaryTree();
		//b.preOrderTraversal(b.root);
		//b.preOrderIterative(b.root);
		//b.inOrderTraversal(b.root);
			b.inOrderIterative(b.root);
	}
	
	public void preOrderTraversal(TreeNode root){
			if(root ==null)
				return;
			System.out.println(root.data+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
			
	}
	
	public void inOrderTraversal(TreeNode root) {
		
		if(root ==null)
			return;
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
		
	}
	
	public void inOrderIterative(TreeNode root) {
		
		if(root==null) return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty() || temp!=null) {
			if(temp!=null) {
				stack.push(temp);
				temp = temp.left;
			}else {
				temp = stack.pop();
				System.out.println(temp.data);
				temp = temp.right;
			}
		}
		
	}
	
	// Pre Order travelsal using Stack iterative Model
	
	public void preOrderIterative(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.println(temp.data);
			
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			
			if(temp.left!=null) {
				stack.push(temp.left);
			}
		}
	}

}
