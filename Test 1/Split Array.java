public class solution {

	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return splitArray(input,0,0,0);
	}
    
     public static boolean splitArray(int arr[], int si, int lsum, int rsum) 
	{ 
         //lsum for sum of numbers divisible by 5 and rsum for sum of numbers divisible by 3
  
    	if (si == arr.length) 
        {
            return lsum == rsum;
        }
         
    	if (arr[si] % 5 == 0)
        {
            lsum += arr[si];
        }
        else if (arr[si] % 3 == 0) 
        {
            rsum += arr[si]; 
        }
        else
        {
            return splitArray(arr,si+1, lsum+arr[si], rsum)  || splitArray(arr,si+1,lsum,rsum+arr[si]);
        }
         
    	return splitArray(arr,si+1,lsum,rsum); 
	}
	

}
