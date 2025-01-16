class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int ele : asteroids)
        {
            if(mass < ele)  return false;
            mass += ele;
            if(mass > 100000)   return true;
        }
        return true;
    }
}