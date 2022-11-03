public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return allindexes(input,x,0);
	}
		private static int[] allindexes(int input[], int x, int start){
			if(start >= input.length)
			{
				int output[]= new int[0];
				return output;
			}
			int value[] = allindexes(input,x,start+1);
			if(input[start] == x)
			{
				int output[] = new int[value.length + 1];
				output[0] = start;
				for(int i = 0; i < value.length; i++)
				{
					output[i+1]  = value[i];
				}
				return output;
			}else
				return value;
		}
}
