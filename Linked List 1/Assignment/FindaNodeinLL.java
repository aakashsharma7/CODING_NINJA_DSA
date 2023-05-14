/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
		LinkedListNode<Integer> node = head;
		int count = 0;
		while (node != null) {
			if (node.data == n) {
				return count;
			} else {
				node = node.next;
				count++;
			}
		}
		return -1;
	}
}
