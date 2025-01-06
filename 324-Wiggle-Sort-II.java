class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int l = nums.length;
        int[] copy = Arrays.copyOf(nums,l);
        int j = l%2==1?l/2:l/2-1,k = l-1;
        for(int i = 0; i < l; i++)
            nums[i] = (i&1) == 0 ? copy[j--] : copy[k--];   
    }
}