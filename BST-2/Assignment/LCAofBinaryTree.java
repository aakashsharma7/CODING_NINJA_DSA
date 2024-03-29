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

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		  if(root==null) {
				return -1;
			}
			if(root.data==a || root.data==b) {
				return root.data;
			}
			int leftLca = getLCA(root.left, a, b);
			int rightLca = getLCA(root.right, a, b);
			if(leftLca==-1 && rightLca ==-1) {
				return -1;
			}
			else if(leftLca==-1) {
				return rightLca;
			}
			else if(rightLca==-1) {
				return leftLca;
			}
			else {
				return root.data;
			}
        
	}

}
