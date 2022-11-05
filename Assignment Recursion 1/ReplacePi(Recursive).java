public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
		if(input.length()==1 || input.length()==0 )
            return input;
        
        if(input.charAt(1)=='i' && input.charAt(0)=='p')
            return "3.14" + replace(input.substring(2));
        else
            return input.charAt(0)+replace(input.substring(1));
        

	}
}
