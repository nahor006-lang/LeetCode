class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int i = 0, j = numbers.size() -1;
        while(i<j)
        {
            int a = numbers[i] + numbers[j];
            if(a==target)
            {
                vector<int> s = {i+1,j+1};
                return s;
            }
            else if(a > target) j--;
            else i++;
        }
        return {0,0};
    }
};