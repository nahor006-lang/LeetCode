class Solution {
public:
    bool isPalindrome(int x) {
        int val =x;
        long long rev = 0;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        while(x>0)
        {
            int rem = x%10;
            rev = rev*10 + rem;
            x /= 10;
        }
        if(val == rev) return true;
        else return false;
    }
};
