/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		  if(root==null) {
			return ;
		}
		
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
		
		BinaryTreeNode<Integer>  temp = root.left;
		root.left = newNode;
		newNode.left = temp;
        
	}
	
}
