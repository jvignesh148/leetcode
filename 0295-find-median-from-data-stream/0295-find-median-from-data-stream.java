class MedianFinder {
    List<Integer> list=new ArrayList<>();
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        int index = Collections.binarySearch(list, num);
        if (index < 0) index = -index - 1;
        list.add(index, num);          
    }
    
    public double findMedian() {
        if(list.size()%2!=0){
            return (double) list.get(list.size()/2);
        }
        return (double) (list.get(list.size()/2)+list.get(list.size()/2-1))/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */