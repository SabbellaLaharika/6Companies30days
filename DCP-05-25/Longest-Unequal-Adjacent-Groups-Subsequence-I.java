class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int l = words.length,prev=-1;
        for(int i = 0; i < l;i++){
            if(groups[i] != prev){
                prev = groups[i];
                result.add(words[i]);
            }
        }
        return result;
    }
}