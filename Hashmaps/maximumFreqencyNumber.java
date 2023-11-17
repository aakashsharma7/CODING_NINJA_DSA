import java.util.HashMap;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int item:arr) {
			//we are going through each item of the array and put its frequency as value .and item in array as key
			if(hashMap.containsKey(item)) {
				hashMap.put(item, hashMap.get(item)+1);
			}else {
				hashMap.put(item, 1);
			}
			//hashMap.put(item, hashMap.getOrDefault(item, 0)+1)
		}
		int max = 0, ans = Integer.MIN_VALUE;
		for(int item:arr) 
		{
			if(hashMap.get(item) > max)
			{
			  max = hashMap.get(item);
			  ans = item;
			}
		}
		return ans;
	}
    }
}

