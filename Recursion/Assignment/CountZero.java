public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(n == 1){
			return m;
		}
		int total = m+multiplyTwoIntegers(m, --n);
		return total;
	}
}
