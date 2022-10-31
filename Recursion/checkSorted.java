public class CheckSorted {
    public static boolean checkSorted(int input[]){
        if(input.length <= 1){
            return true;
        }
        int smallinput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallinput[i-1] = input[i];
        }
        boolean smallAns = checkSorted(smallinput);
        if(!smallAns){
            return false;
        }
        if(input[0] <= input[1]){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int smallinput[] = {2,1,3,6,9};   //This is not sorted array. 
        System.out.println(checkSorted(smallinput)); //False 
    }
}
