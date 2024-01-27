public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Change in the given tree itself.
            * No need to return or print the output.
            * Taking input and printing output is handled automatically.
            */
         int storage[][]=new int[n+1][maxWeight+1];
         for(int i=0;i<n+1;i++){
             for(int j=0;j<maxWeight+1;j++){
                 storage[i][j]=-1;
             }
         }
         return knapsack(weight,value,maxWeight,n+1,storage,0);

    }
     public static int knapsack(int[] weight,int value[],int maxWeight,int n,int[][] storage,int i){
        if(i==weight.length || maxWeight==0){
            storage[i][maxWeight]=0;
            return storage[i][maxWeight];}

        if(storage[i][maxWeight]!=-1)
            return storage[i][maxWeight];
        if(weight[i]>maxWeight)
        {
            storage[i][maxWeight]=knapsack(weight,value,maxWeight,n-1,storage,i+1);
            return storage[i][maxWeight];
        }
        else{
            int op1=value[i]+knapsack(weight,value,maxWeight-weight[i],n-1,storage,i+1);
            int op2=knapsack(weight,value,maxWeight,n-1,storage,i+1);
            storage[i][maxWeight]=Math.max(op1,op2);
            return storage[i][maxWeight];
        }
    }
}
