class Solution {
public:
    string convertToTitle(int columnNumber) {
        string result = \\;
        int remainder;
        while(columnNumber > 26)
        {   
            remainder = columnNumber % 26 == 0 ? 26 : columnNumber % 26;
            result += (char)(64+remainder);
            columnNumber -= remainder;
            columnNumber = columnNumber / 26;
        }
        result += (char)(64+columnNumber);
        reverse(result.begin(),result.end());
        return result;
    }
};