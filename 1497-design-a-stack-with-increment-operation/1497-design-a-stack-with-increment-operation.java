class CustomStack {
    int[] arr;
    int ind=0;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(ind==arr.length) return;
        arr[ind++]=x;
    }
    
    public int pop() {
        if(ind==0) return -1;
        ind--;
        return arr[ind];
    }
    
    public void increment(int k, int val) {
        int index=0,temp=k<ind ? k : ind;
        while(index<temp){
            arr[index]+=val;
            index++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */