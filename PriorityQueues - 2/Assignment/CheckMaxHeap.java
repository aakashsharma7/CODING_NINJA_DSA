public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		   for(int index=0;index<arr.length;index++)
	{
		int parentIndex = index;
		int leftChildIndex = 2*index+1;
		int rightChildIndex = 2*index+2;
		if(leftChildIndex < arr.length && arr[leftChildIndex] > arr[parentIndex]) {
			return false;
		}
		if(rightChildIndex < arr.length && arr[rightChildIndex] > arr[parentIndex]) {
            return false;			
		}
	}
	return true;
	}
}
