import java.util.Arrays;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		 Arrays.sort(arr1);
         Arrays.sort(arr2);
        int i=0,j=0;
        while (i<arr1.length && j<arr2.length)
        {
            if (arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if (arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        
        
	}
    
    public static int[] bubbleSort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        
        return arr;
	}

}
