public static int minCostToMakeElementEqual(int a[],int n)
{
    Arrays.sort(a);
    int y;   
    if (n % 2 == 1) 
        y = a[n / 2]; 
    else
        y = (a[n / 2] + a[(n - 2) / 2]) / 2; 
    int s = 0;  
    for(int i = 0; i < n; i++) 
        s += Math.abs(a[i] - y);   
    return s; 
}
