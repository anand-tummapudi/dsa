package com.datastructures.trees;

public class BinarySearchTree {
	private TreeNode root;
	
	private class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(3);
		bst.insert(1);
		bst.insert(5);
		bst.insert(9);
		bst.insert(10);
		bst.insert(2);
		bst.insert(7);
		
		bst.inOrder();
		
		TreeNode searchEle = bst.search(2);
		
		if(searchEle!=null) {
			System.out.println("Key Found:"+searchEle.data);
		}
	}
	
	public void insert(int value) {
		root = insert(root,value);
	}
	
	public TreeNode insert(TreeNode root,int value) {
		if(root==null) {
			root = new TreeNode(value);
			return root;
		}
		if(value<root.data) {
			root.left = insert(root.left,value);
		}else {
			root.right = insert(root.right,value);
		}
		
	return root;
	}
	
	public void inOrder(){
		inOrder(root);
	}
	
	public void inOrder(TreeNode root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public TreeNode search(int value) {
		return search(root,value);
	}
	
	public TreeNode search(TreeNode root,int key) {
		if(root==null || root.data==key)
			return root;
		if(key<root.data) {
			return search(root.left,key);
		}else {
			return search(root.right,key);
		}
	}
	
	

}
