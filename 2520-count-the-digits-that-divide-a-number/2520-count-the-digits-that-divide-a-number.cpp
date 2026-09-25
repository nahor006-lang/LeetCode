class Solution {
public:
    int countDigits(int num) {
        int digits = 0, org = num;
        while(num != 0)
        {
            int rem = num%10;
            if(org%rem == 0) digits++;
            num = num/10;
        }
        return digits;
    }
};