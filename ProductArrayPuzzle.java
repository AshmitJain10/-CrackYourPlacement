class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long[] prod = new long[n];
        if(n==1){
            prod[0]=1;
            return prod;
        }
        for(int i = 0 ; i<n ; i++){
            long p = 1;
            for(int j = 0 ; j<n;j++){
                if(i!=j){
                    p*=nums[j];
                }
                prod[i] = p;
            }
        }
        return prod;
	} 
} 
