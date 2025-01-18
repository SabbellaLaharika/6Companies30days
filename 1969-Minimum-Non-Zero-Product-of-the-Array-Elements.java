class Solution {
    public int mod = 1000000007;
    public int minNonZeroProduct(int p) {
        //if(p==1)    return 1;
        long n = (long)Math.pow(2,p)-1;
        long result = (n%mod)*(power((n-1),n/2));
        return (int)(result%mod);
    }
    public long power(long x,long n)
    {
        long result = 1;
        //if(x == 0)  return 0;
        while(n>0)
        {
            if(n%2==1)  result=((result%mod)*(x%mod))%mod;
            x=((x%mod)*(x%mod))%mod;
            n/=2;
        }
        return (result%mod);
    }
}