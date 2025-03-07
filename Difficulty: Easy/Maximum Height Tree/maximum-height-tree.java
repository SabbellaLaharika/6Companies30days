//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.height(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int height(int N){
        int s=0,i=1;
        while(s<N){
            s+=i;
            i++;
        }
        return s==N?i-1:i-2;
    }
}