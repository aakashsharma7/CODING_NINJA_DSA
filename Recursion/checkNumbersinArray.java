public class Solution {
	public static boolean c(int arr[],int si,int value){
		 if(si==arr.length){
            return false;
        }
        if(arr[si]==value){
            return true;
        }
        return c(arr,si+1,value);
    }
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return c(input,0,x);
	}
}
