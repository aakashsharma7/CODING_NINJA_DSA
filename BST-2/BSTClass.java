/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

	public class BinarySearchTree {
		private BinaryTreeNode<Integer> root;

		// insert data
		// private helper for insert data
		private BinaryTreeNode<Integer> insertHelper(int data, BinaryTreeNode<Integer> root) {
			if (root == null) {
				BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
				return newNode;
			}
			if (data <= root.data) {
				// insert on left subtree
				root.left = insertHelper(data, root.left);
			} else {
				// insert on right subtree
				root.right = insertHelper(data, root.right);
			}
			return root;
		}

		public void insert(int data) {
			// Implement the insert() function
			root = insertHelper(data, root);

		}

		// remove function'
		// remove helper function
		private BinaryTreeNode<Integer> removeHelper(int data, BinaryTreeNode<Integer> root) {
			if (root == null) {
				return null;
			}
			if (data < root.data) {
				root.left = removeHelper(data, root.left);
				return root;
			} else if (data > root.data) {
				root.right = removeHelper(data, root.right);
				return root;
			} else { // data = root.data
				if (root.left == null && root.right == null) {
					return null;
				} else if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {
					// if both left and right are not null, pick minimum element from right subtree
					// and make that as the root
					BinaryTreeNode<Integer> minNode = root.right;
					while (minNode.left != null) {
						minNode = minNode.left;
					}
					root.data = minNode.data;
					root.right = removeHelper(minNode.data, root.right);
					return root;

				}

			}

		}

		// tree remove function
		public void remove(int data) {
			// Implement the remove() function
			root = removeHelper(data, root);
		}

		// tree print function
		private void printTree(BinaryTreeNode<Integer> root) {
			if (root == null) {
				return;
			}
			String toBePrinted = root.data + ":";
			if (root.left != null) {
				toBePrinted += "L:" + root.left.data + ",";
			}

			if (root.right != null) {
				toBePrinted += "R:" + root.right.data;
			}
			System.out.println(toBePrinted);
			printTree(root.left);
			printTree(root.right);
		}

		public void printTree() {
			printTree(root);
		}

		// search
		// helper function
		private boolean helperSearch(int data, BinaryTreeNode<Integer> root) {
			if (root == null) {
				return false;
			}
			if (root.data == data) {
				return true;
			} else if (data > root.data) {
				// call right
				return helperSearch(data, root.right);
			} else {
				// call left
				return helperSearch(data, root.left);
			}
		}

		public boolean search(int data) {
			// Implement the search() function
			return helperSearch(data, root);
		}

	}
