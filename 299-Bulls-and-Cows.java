class Solution {
    public String getHint(String secret, String guess) {
        int x=0,y=0;
        Map<Character,Integer> secretMap = new HashMap<Character,Integer>();
        Map<Character,Integer> guessMap = new HashMap<Character,Integer>();
        for(int i = 0; i < secret.length(); i++)
        {
            if(secret.charAt(i) == guess.charAt(i)) x++;
            else
            {
                secretMap.put(secret.charAt(i),secretMap.getOrDefault(secret.charAt(i),0)+1);
                guessMap.put(guess.charAt(i),guessMap.getOrDefault(guess.charAt(i),0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : guessMap.entrySet())
        {
            if(secretMap.get(entry.getKey()) != null)
            {
                if(secretMap.get(entry.getKey()) <= entry.getValue())
                y += secretMap.get(entry.getKey());
                else
                y += entry.getValue();
            }
        }
        return \\+x+\A\+y+\B\;
    }
}