class BrowserHistory {
    Stack<String> st1=new Stack<>();
    Stack<String> st2=new Stack<>();
    public BrowserHistory(String homepage) {
        st1.push(homepage);
    }
    
    public void visit(String url) {
        st1.push(url);
        st2.clear();
    }
    
    public String back(int steps) {
        int i=0;
        while(st1.size()>1 && i<steps){
            st2.push(st1.pop());
            i++;
        }
        return st1.peek();
    }
    
    public String forward(int steps) {
        int i=0;
        while(!st2.isEmpty() && i<steps){
            st1.push(st2.pop());
            i++;
        }
        return st1.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */