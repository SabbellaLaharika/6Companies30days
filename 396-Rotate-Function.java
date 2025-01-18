class Solution {
    public int maxRotateFunction(int[] nums) {
        int l = nums.length;
        int s = add(nums);
        int dp = 0,i;
        for(i = 1; i < nums.length; i++) dp += (i*nums[i]);
        int result = dp;
        while(i > 0)
        {
            dp = dp + s - (l*nums[i-1]);
            result = dp > result ? dp : result;
            i--;
        }
        return result;
    }
    public int add(int[] arr)
    {
        int res = 0;
        for(int ele : arr) res += ele;
        return res;
    }
}