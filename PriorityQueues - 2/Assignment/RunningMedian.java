import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

	public static void findMedian(int arr[])  {
        
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
    PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i : arr) {
			
			if(max.isEmpty()) {
				max.add(i);
			}
			else if( i  > max.peek() ) {
				min.add(i);
				if( (min.size() - max.size()) > 1 ) {
					int p = min.remove();
					max.add(p);
				}
			}
			else {
				max.add(i);
				if( (max.size() -min.size()) > 1  ) {
					int p = max.remove();
					min.add(p);
				}
			}
			
			if(max.size() > min.size()) {
				System.out.print(max.peek()+" ");
			}
			else if(max.size() < min.size()) {
				System.out.print(min.peek()+" ");
			}
			else {
				System.out.print( (max.peek() + min.peek()) /2  +" ");
			}
			
    }
    }


}
