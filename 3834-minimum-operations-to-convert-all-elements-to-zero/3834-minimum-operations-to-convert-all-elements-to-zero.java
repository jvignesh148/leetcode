class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int result=0;
        st.push(0);
        for(int i=0;i<=nums.length;i++){
            int temp;
            if(i==nums.length) temp=0;
            else temp=nums[i];
            while(st.peek()>temp) st.pop();
            if(st.peek()<temp) { 
                result++;
                st.push(nums[i]);
            }
        }
        return result;
    }
}