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

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null) {
			return 0;
		}

		int smallLeftOutput = height(root.left);
		int smallRightOutput = height(root.right);
		if (smallLeftOutput > smallRightOutput) {
			return smallLeftOutput + 1;
		} else {
			return smallRightOutput + 1;
		}
	}

}
