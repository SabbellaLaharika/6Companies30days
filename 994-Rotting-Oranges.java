class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length, c = grid[0].length,freshCount = 0,prevCount;
        if(r == 1 && c == 1)
        {
            if(grid[0][0] == 1) return -1;
            return 0;  
        }
        int[][] copy = new int[r][c];
        for(int i = 0; i < r; i++)
        {   copy[i] = Arrays.copyOf(grid[i],c);
            for(int j = 0; j < c; j++)
                if(grid[i][j] == 1) freshCount++;
        }
        System.out.println(freshCount);
        int result = 0;
        while(freshCount > 0)
        {
            prevCount = freshCount;
            if(r > 1 && c > 1)
            {
                for(int i = 0; i < r; i++)
                {
                    for(int j = 0; j < c; j++)
                    {
                        if(grid[i][j] == 1)
                        {
                            if(i != 0 && j != 0 && i != r-1 && j != c-1)
                            {
                                if(copy[i-1][j] == 2 || copy[i][j-1] == 2 || copy[i+1][j] == 2 || copy[i][j+1] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i == 0 && j != 0 && j != c-1)
                            {
                                if(copy[0][j-1] == 2 || copy[1][j] == 2 || copy[0][j+1] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i != 0 && j == 0 && i != r-1)
                            {
                                if(copy[i-1][0] == 2  || copy[i+1][0] == 2 || copy[i][1] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i == 0 && j == 0)
                            {
                                if(copy[1][0] == 2 || copy[0][1] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i == r-1 && j == c-1)
                            {
                                if(copy[r-2][c-1] == 2 || copy[r-1][c-2] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i == 0 && j == c-1)
                            {
                                if(copy[0][c-2] == 2 || copy[1][c-1] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i == r-1 && j == 0)
                            {
                                if(copy[r-1][1] == 2 || copy[r-2][0] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i == r-1 && j != 0 && j != c-1)
                            {
                                if(copy[r-1][j-1] == 2 || copy[r-2][j] == 2 || copy[r-1][j+1] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                            else if(i != 0 && j == c-1 && i != r-1)
                            {
                                if(copy[i-1][c-1] == 2  || copy[i+1][c-1] == 2 || copy[i][c-2] == 2)
                                {    
                                    grid[i][j] = 2;
                                    freshCount--;
                                }
                            }
                        }
                    }   
                }
            }
            else if(r == 1)
            {
                for(int j = 0; j < c; j++)
                {
                    if(grid[0][j] == 1)
                    {
                        if(j != 0 && j != c-1)
                        {
                            if(copy[0][j-1] == 2 || copy[0][j+1] == 2)
                            {    
                                grid[0][j] = 2;
                                freshCount--;
                            }
                        }
                        else if(j == 0)
                        {
                            if(copy[0][1] == 2)
                            {    
                                grid[0][0] = 2;
                                freshCount--;
                            }
                        }
                        else if(j == c-1)
                        {
                            if(copy[0][c-2] == 2)
                            {    
                                grid[0][j] = 2;
                                freshCount--;
                            }
                        }
                    }   
                }
            }
            else if(c == 1)
            {
                for(int i = 0; i < r; i++)
                {
                    if(grid[i][0] == 1)
                    {
                        if(i != 0 && i != r-1)
                        {
                            if(copy[i-1][0] == 2 || copy[i+1][0] == 2)
                            {    
                                grid[i][0] = 2;
                                freshCount--;
                            }
                        }
                        else if(i == 0)
                        {
                            if(copy[1][0] == 2)
                            {    
                                grid[0][0] = 2;
                                freshCount--;
                            }
                        }
                        else if(i == r-1)
                        {
                            if(copy[r-2][0] == 2)
                            {    
                                grid[i][0] = 2;
                                freshCount--;
                            }
                        }
                    } 
                }
            }
            System.out.println(Arrays.deepToString(grid));
            System.out.println(Arrays.deepToString(copy));
            System.out.println(prevCount + " " + freshCount);
            if(freshCount == prevCount) return -1;
            for(int i = 0; i < r; i++)
                copy[i] = Arrays.copyOf(grid[i],c);
            result++;
        }
        return result;
    }
}