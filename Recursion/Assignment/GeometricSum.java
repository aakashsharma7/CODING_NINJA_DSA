public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
		if(k == 0){
			return 1;
		}
		double total= 1/Math.pow(2,k);
		total += findGeometricSum(--k);
		return total;
	}
}
