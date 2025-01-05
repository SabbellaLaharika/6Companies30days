class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        char[] sch = s.toCharArray();
        for(char ch : sch)
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        for(int i = 0; i < s.length(); i++)
            if(mp.get(sch[i])==1)   return i;
        return -1;
    }
}