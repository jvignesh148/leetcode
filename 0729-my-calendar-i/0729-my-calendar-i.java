class MyCalendar {
    PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
    public MyCalendar() {
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] arr : pq){
            if(Math.max(arr[0],startTime) < Math.min(arr[1],endTime)) return false;
        }
        pq.offer(new int[]{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */