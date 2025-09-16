class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int num : nums){
            st.push(num);
            while(st.size()>1){
                int num1=st.pop(),num2=st.pop();
                if(gcd(num1,num2)>1){
                    st.push(lcm(num1,num2));
                }
                else {
                    st.push(num2);
                    st.push(num1);
                    break;
                }
            }
        }
        return new ArrayList<>(st);
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int lcm(int a, int b){
        return (int) ((long) (a/gcd(a,b))*b);
    }
}