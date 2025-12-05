class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st = new Stack<>();
        int num = 1;
        for(char c : pattern.toCharArray()) {
            if(st.isEmpty() && c == 'I') {
                sb.append(num);
                num++;
            }
            else if(!st.isEmpty() && c == 'I') {
                int temp = num;
                while(!st.isEmpty()) {
                    sb.append(num);
                    st.pop();
                    num--;
                }
                sb.append(num);
                num = temp;
                num++;
            }
            else {
                st.push(c);
                num++;
            }
        }
        while(!st.isEmpty()) {
            sb.append(num);
            st.pop();
            num--;
        }
        sb.append(String.valueOf(num));
        return sb.toString();
    }
}