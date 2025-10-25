class ExamTracker {
    List<Integer> list;
    List<Long> prefix; 
    public ExamTracker() {
        list=new ArrayList<>();
        prefix=new ArrayList<>();
    }
    
    public void record(int time, int score) {
        list.add(time);
        if(prefix.isEmpty()) prefix.add((long) score);
        else prefix.add(prefix.get(prefix.size()-1)+(long) score);
    }
    
    public long totalScore(int startTime, int endTime) {
        int right=-1;
        int n=0,m=list.size()-1;
        while(n<=m){
            int mid=n+((m-n)>>1);
            if(list.get(mid)<=endTime){
                right=mid;
                n=mid+1;
            }
            else m=mid-1;
        }
        int left=-1;
        n=0;
        m=list.size()-1;
        while(n<=m){
            int mid=n+((m-n)>>1);
            if(list.get(mid)<startTime){
                left=mid;
                n=mid+1;
            }
            else m=mid-1;
        }
        if(right==-1 || right<left) return 0;
        return left==-1 ? prefix.get(right) : prefix.get(right)-prefix.get(left);
    }
    
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */