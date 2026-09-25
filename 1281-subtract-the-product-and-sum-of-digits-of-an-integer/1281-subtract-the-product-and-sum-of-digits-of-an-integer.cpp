class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum = 0, prd = 1, diff = 0;
        while(n > 0)
        {
            int lastdigit = n%10;
            sum += lastdigit;
            prd *= lastdigit;
            n/= 10;
        }
        return prd - sum;
    }
};