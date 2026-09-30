class Solution {
    public String removeOuterParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(!st.isEmpty()){
                    st.push("(");
                    ans.append(c);
                }
                else{
                    st.push("(");
                }
            }
            else{
                if(c == ')'){
                    st.pop();
                    if(!st.isEmpty()){
                        ans.append(c);
                    }
                }
            }
        }
        return ans.toString();
    }
}