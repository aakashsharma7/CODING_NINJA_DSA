public class solution {
	// element - number to be searched
	private static int search(int arr[], int start, int end, int target){
		int mid = (start+end)/2;

		if(start >= end)
		{
			return -1;
		}
		if(target == arr[mid])
		{
			return mid;
		}else if(target < arr[mid])
		{
			return search(arr, start, mid-1, target);
		}else{
			return search(arr, mid+1, end, target);
		}
	}
	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
		int len = input.length;
		int end = len-1;
		int start = 0;
		return search(input, start, end, element);
	}
}
