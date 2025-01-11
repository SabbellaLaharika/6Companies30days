class KthLargest {
    int num = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        num = k;
        for(int ele : nums)
        {
            pq.add(ele);
            if(pq.size() > num)
                pq.poll();
        }
    }
    public int add(int val) {
        pq.add(val);
        if(pq.size() > num)
            pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */