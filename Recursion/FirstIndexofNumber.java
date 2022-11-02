public class Solution {

	public static int firstIndex(int input[], int x, int startIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		  if(startIndex==input.length){
            return -1;
        }
		if(input[startIndex]==x){
            return startIndex;
        }
        return firstIndex(input,x,startIndex+1);
		
	}
    
    public static int firstIndex(int input[], int x) {
        return firstIndex(input,x,0);
	}
	
}
