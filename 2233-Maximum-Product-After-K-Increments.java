class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println(Long.MAX_VALUE);
        for(int ele : nums) pq.add(ele);
        int val;
        while(k-- > 0)
        {
            val = pq.poll();
            pq.add(val+1);
        }
        long result = 1;
        while(!pq.isEmpty())  
        {
            result *= pq.poll();
            result %= 1000000007;
        }
        return (int)result;
    }
}