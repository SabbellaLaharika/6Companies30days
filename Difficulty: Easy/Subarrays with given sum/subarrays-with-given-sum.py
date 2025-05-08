#User function Template for python3

class Solution:
    def subArraySum(self,arr,k):  
        pre_sum_count = {}
        pre_sum_count[0] = 1
        pre_sum = 0
        result = 0
        for i in arr:
            pre_sum += i
            if pre_sum - k in pre_sum_count :
                result += pre_sum_count[pre_sum - k]
            if pre_sum in pre_sum_count:
                pre_sum_count[pre_sum] += 1
            else:
                pre_sum_count[pre_sum] = 1
        return result;


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        k = int(input().strip())
        ob = Solution()
        ans = ob.subArraySum(arr, k)
        print(ans)
        tc -= 1
        print("~")

# } Driver Code Ends