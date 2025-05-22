class Solution {
    public int calculate(String s) {
        char[] ch=s.toCharArray();
        Stack<Integer> st=new Stack<>();
        int res=0,sign=1,num=0;
        for(char c : ch){
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); 
            }
            else if(c=='+'){
                res+=sign*num;
                num=0;
                sign=1;
            }
            else if(c=='-'){
                res+=sign*num;
                num=0;
                sign=-1;
            }
            else if(c=='('){
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            }
            else if(c==')'){
                res += sign * num;
                num = 0;
                res *= st.pop(); 
                res += st.pop();
            }
        }
        res += sign * num;
        return res;
    }
}