class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char ch : s.toCharArray())
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        pq.addAll(hm.entrySet());
        String result = \\;
        while(!pq.isEmpty())
        {
            Map.Entry<Character,Integer> e = pq.poll();
            result += (\\+e.getKey()).repeat(e.getValue());
        }
        return result.toString();
    }
}