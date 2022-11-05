public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		int n = s.length();
		if(s.length() <= 1 ){
			return s;
		}
		String out = addStars(s.substring(1));
		if(s.charAt(0)==s.charAt(1)){
			   out = s.charAt(0) + "*" + s.charAt(1) + out.substring(1);
		}else{
			out = s.charAt(0) + out;
		}
		return out;
	}
}
