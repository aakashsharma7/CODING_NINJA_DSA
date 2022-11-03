public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
		if(input == 0){
			return 0;
		}
		int rem = input%10;
		int total = rem+sumOfDigits(input/10);
		return total;
	}
}
