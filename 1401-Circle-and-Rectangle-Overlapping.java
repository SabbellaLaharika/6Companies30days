class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int distx = distanceToEdge(x1,x2,xCenter);
        double disty = distanceToEdge(y1,y2,yCenter);
        return distx*distx + disty*disty <= radius*radius;
    }
    public int distanceToEdge(int a, int b, int center)
    {
        if (a <= center && center <= b)      return 0;
        if (center < a)     return a - center;
        return center - b;
    }
}