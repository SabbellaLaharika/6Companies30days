class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int result = 0;
        for(int ele : nums)
            result += Math.abs(ele - mid);
        return result;
    }
}