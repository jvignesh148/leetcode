class Solution {
    public int minAddToMakeValid(String s) {
        /*  MY CODE
        int result = 0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') st.push(c);
            else{
                if(!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
                else result++;
            }
        }
        result += st.size();
        return result;*/

        // 0ms CODE
        int open = 0, extra = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') open++;
            else{
                if(open > 0) open--;
                else extra++;
            }
        }
        return open + extra;
    }
}