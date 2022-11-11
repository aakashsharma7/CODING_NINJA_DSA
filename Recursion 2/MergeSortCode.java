import java.util.*;
public class solution {
	public static void mergeSort(int[] input){
		// Write your code here
		 if(input.length <= 1)
        {
            return;
        }
        int mid = input.length/2;
        int part1[] = new int[mid];
        int part2[] = new int[input.length - mid];
            for(int i = 0; i < mid; i++)
            {
                part1[i] = input[i];
            }
            int k = 0;
            for(int i = mid; i < input.length; i++)
            {
                part2[k] = input[i];
                k++;
            }
            mergeSort(part1);
            mergeSort(part2);
            merge(input, part1, part2);
    }
    // function for merging the array 
    private static void merge (int input[],int part1[], int part2[])
    {
            int i = 0 , j = 0 , k = 0;
            while(i < part1.length && j < part2.length)
            {
                if(part1[i] < part2[j])
                {
                    input[k] = part1[i];
                    k++;
                    i++;
                }
                else
                {
                    input[k] = part2[j];
                    k++;
                    j++;
                }
            }
                while(i < part1.length)
                {
                    input[k] = part1[i];
                    k++;
                    i++;
                }
                while(j < part2.length)
                {
                    input[k] = part2[j];
                    k++;
                    j++;
                }

    }
    // function for taking input 
    public static int[] takeinput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements : ");
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the element for " + i + " : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // function for printing the array 
    public static void printArray(int input[])
    {
        for(int i = 0; i < input.length; i++)
        {
            System.out.print(input[i] + " ");
	    }
    } 
}
