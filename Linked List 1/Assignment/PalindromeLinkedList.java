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
import java.util.*;
public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
		 LinkedListNode<Integer> node=head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (node!=null)
        {
            arr.add(node.data);
            node=node.next;
        }
        int start=0, end=arr.size()-1;
        while(start<end)
        {
            if (arr.get(start)!=arr.get(end))
            {
                return false;
            }
            else
            {
                start=start+1;
                end=end-1;
            }
        }
        
        return true;
	}

}
