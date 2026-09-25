class Solution {
public:
    int numberOfSteps(int num) {
        int steps = 0, org = num;
        while(num != 0)
        {
            if(num%2 == 0) num = num/2;
            else num--;
            steps+=1;
        }
        return steps;
    }
};