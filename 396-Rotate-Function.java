class Solution {
    public int maxRotateFunction(int[] nums) {
        int l = nums.length;
        int s = nums[0];
        int dp = 0,i;
        for(i = 1; i < nums.length; i++)
        {
            s += nums[i];
            dp += (i*nums[i]);
        } 
        int result = dp;
        while(i > 0)
        {
            dp = dp + s - (l*nums[i-1]);
            result = dp > result ? dp : result;
            i--;
        }
        return result;
    }
}