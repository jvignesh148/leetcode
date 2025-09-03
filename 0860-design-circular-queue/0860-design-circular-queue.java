class MyCircularQueue {
    List<Integer> list=new ArrayList<>();
    int size;
    public MyCircularQueue(int k) {
       size=k;
    }
    
    public boolean enQueue(int value) {
        list.add(value);
        if(list.size()>size){
            list.remove(size);
            return false;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(list.size()>0){
            list.remove(0);
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(list.size()==0) return -1;
        return list.get(0);
    }
    
    public int Rear() {
        if(list.size()==0) return -1;
        return list.get(list.size()-1);
    }
    
    public boolean isEmpty() {
        return list.size()==0;
    }
    
    public boolean isFull() {
        return list.size()==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */