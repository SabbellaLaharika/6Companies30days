class Solution:
    def minNonZeroProduct(self, p: int) -> int:
        n = 2**p-1
        return (pow(n-1,n>>1,10**9+7)*n)%(10**9+7)