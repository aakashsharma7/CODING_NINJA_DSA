public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
		int val=0;
        for (int i=0;i<arr.length;i++)
        {
            val=val^arr[i];
        }
        return val;
	}
}
