class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        boolean flag = true;
        for(int a : asteroids){
            flag = true;
            while(!st.isEmpty() && st.peek()>0 && a<0){
                if(!st.isEmpty() && st.peek()<Math.abs(a)){
                    st.pop();
                    continue;
                }
                else if(!st.isEmpty() && st.peek()==Math.abs(a)){
                    st.pop();
                }
                flag = false;
                break;
            }
            if(flag) st.push(a);
        }
        int[] ans = new int[st.size()];
        int i = 0;
        for(Integer element : st){
            ans[i++] = element;
        } 
        return ans;
    }
}