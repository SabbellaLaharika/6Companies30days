class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int l = nums.length;
        int[][] elements = new int[l][2];
        for(int i = 0; i < l; i++)
        {
            elements[i][0] = nums[i];
            elements[i][1] = i;
        } 
        Arrays.sort(elements, (a,b) -> Integer.compare(a[0],b[0]));
        int[][] values = new int[k][2];
        for(int i = 0; i < k; i++)
            values[i] = elements[l-i-1];
        Arrays.sort(values, (a,b) -> Integer.compare(a[1],b[1]));
        int[] result = new int[k];
        for(int i = 0; i < k; i++)
            result[i] = values[i][0];
        return result;
    }
} 