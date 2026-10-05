class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                res = opeartion(a, b, s);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
    public int opeartion(int a, int b, String op){
        if(op.equals("+")) return a+b;
        else if(op.equals("-")) return a-b;
        else if(op.equals("*")) return a*b;
        else return a/b;
    }
}