class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long firstZeroCount = 0, secondZeroCount = 0, firstSum = 0, secondSum = 0;
        for(int ele : nums1){
            if(ele == 0)    firstZeroCount++;
            firstSum += ele;
        }
        for(int ele : nums2){
            if(ele == 0)    secondZeroCount++;
            secondSum += ele;
        }
        long sum1 = firstSum + firstZeroCount;
        long sum2 = secondSum + secondZeroCount;
        if(firstZeroCount > 0 && secondZeroCount > 0)   return sum1 > sum2 ? sum1 : sum2;
        if(firstZeroCount > 0 && secondZeroCount == 0)    return sum1 <= secondSum ? secondSum : -1;
        if(secondZeroCount > 0 && firstZeroCount == 0)   return sum2 <= firstSum ? firstSum : -1;
        return sum1 == sum2 ? sum1 : -1;
    }
} 