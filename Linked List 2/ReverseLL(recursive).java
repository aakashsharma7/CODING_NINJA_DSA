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

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		//Your code goes here
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> smallerHead = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> node = smallerHead;
        while (node.next != null) {
            node = node.next;
        }
        node.next = head;
        head.next = null;
        return smallerHead;
	}

}
