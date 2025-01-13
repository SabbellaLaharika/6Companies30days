#define PSI pair<string,int>
class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
        map<string,int> mp;
        for(string word : words)    mp[word]++;
        auto cmp = [](PSI a, PSI b){return a.second < b.second || (a.second == b.second && a.first > b.first);};
        priority_queue<PSI,vector<PSI>,decltype(cmp)> pq;
        for(PSI pair : mp) pq.push(pair);
        vector<string> result;
        while(k--)
        {
            result.emplace_back(pq.top().first);
            pq.pop();
        }
        return result;
    }
};
