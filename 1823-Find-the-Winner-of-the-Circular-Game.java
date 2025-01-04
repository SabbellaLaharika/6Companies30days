class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++) arr.add(i);
        int currentIndex,nextIndex;
        currentIndex = 0;
        while(arr.size() > 1)
        {
            nextIndex = (currentIndex + k - 1) % arr.size();
            arr.remove(nextIndex);
            currentIndex = nextIndex;
        }
        return arr.get(0);
    }
}