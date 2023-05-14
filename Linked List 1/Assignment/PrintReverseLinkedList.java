/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
		LinkedListNode<Integer> smallOutput = printReverseRecursion(root);
	}

	public static LinkedListNode<Integer> printReverseRecursion(LinkedListNode<Integer> node) {
		if (node == null)
			return node;
		LinkedListNode<Integer> smallOutput = printReverseRecursion(node.next);
		System.out.print(node.data + " ");
		return smallOutput;
	}

}
