class StockSpanner {
    Stack<int[]> st=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count=1;
        while(!st.isEmpty() && price>=st.peek()[0]){
            count+=st.pop()[1];
        }
        st.push(new int[]{price,count});
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */