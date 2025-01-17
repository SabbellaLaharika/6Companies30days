
class Solution {
public:
    string numberToWords(int num) {
        if(num == 0)
            return \Zero\;
        string ones[20] = {\\,\One\, \Two\, \Three\, \Four\, \Five\, \Six\, \Seven\, \Eight\, \Nine\, \Ten\,  \Eleven\, \Twelve\, \Thirteen\, \Fourteen\, \Fifteen\, \Sixteen\, \Seventeen\,   \Eighteen\, \Nineteen\};
        string tens[10] = {\\, \Ten\,\Twenty\,\Thirty\, \Forty\, \Fifty\, \Sixty\, \Seventy\, \Eighty\, \Ninety\};
        vector<string> words;
        int i = 1,onerem,tworem,threerem;
        string res;
        while(num > 0)
        {
            onerem = num % 10;
            tworem = num % 100;
            threerem = num % 1000;
            if (i % 3 == 1)
            {
                if (tworem == 0 && threerem != 0)
                {
                    res = ones[threerem/100];
                    res += \ Hundred\;
                    i += 2;
                    num /= 100;
                }
                else if(9 < tworem && tworem < 20)
                {
                    num /= 10;
                    i += 1;
                    res = ones[tworem];
                }
                else if(onerem == 0 && 19 < tworem && tworem < 99)
                {
                    res = tens[tworem / 10];
                    i += 1;
                    num /= 10;
                }
                else    res = ones[onerem];
                if(threerem != 0)
                {
                    if(i > 3 && i < 7)    res += \ Thousand\;
                    else if(i > 6 && i < 10)    res += \ Million\;
                    else if(i > 9 && i < 13)    res += \ Billion\;
                }
            }
            else if(i % 3 == 2)    res = tens[onerem];
            else if(i % 3 == 0 && onerem != 0) 
            {
                res = ones[onerem];
                res += \ Hundred\;
            }
            if (res != \\)
            {
                words.push_back(res);
                res = \\;
            }
            num /= 10;
            i += 1;
        }
        reverse(words.begin(),words.end());
        //cout << li;
        string result = \\;
        for(int i = 0; i < words.size()-1;i++)
            result += (words[i] + \ \);
        result += words[words.size()-1];
        return result;
    }
};