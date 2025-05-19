//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            int[][] image = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S2 = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) image[i][j] = Integer.parseInt(S2[j]);
            }
            int sr = Integer.parseInt(br.readLine().trim());
            int sc = Integer.parseInt(br.readLine().trim());
            int newColor = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)  return image;
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        int r = image.length,c = image[0].length,x,y;
        int oldColor = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc] = newColor;
        while(!q.isEmpty()){
            int[] front = q.poll(); 
            for(int[] direction : directions){
                x = front[0]+direction[0];
                y = front[1]+direction[1];
                if(x >= 0 && x < r && y >= 0 && y < c && image[x][y] == oldColor){
                    image[x][y] = newColor;
                    q.add(new int[]{x,y});
                }
            }
        }
        return image;
    }
}