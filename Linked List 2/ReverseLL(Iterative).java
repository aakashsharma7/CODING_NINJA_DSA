/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode previous = null;
        LinkedListNode current = head;

        // traverse the list
        while (current != null) {
            // tricky: note the next node
            LinkedListNode next = current.next;

            current.next = previous; // fix the current node

            previous = current;
            current = next;
        }

        // fix the head to point to the new front
        return previous;
	}
}
