class MyCircularDeque {
    List<Integer> list=new ArrayList<>();
    int size;
    public MyCircularDeque(int k) {
        size=k;
    }
    
    public boolean insertFront(int value) {
        if(list.size()==size) return false;
        list.add(0,value);
        return true;
    }
    
    public boolean insertLast(int value) {
        list.add(value);
        if(list.size()>size){
            list.remove(size);
            return false;
        }
        return true;
    }
    
    public boolean deleteFront() {
        if(list.size()>0){
            list.remove(0);
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
        if(list.size()==0) return false;
        list.remove(list.size()-1);
        return true;
    }
    
    public int getFront() {
        if(list.size()>0){
            return list.get(0);
        }
        return -1;
    }
    
    public int getRear() {
        if(list.size()>0){
            return list.get(list.size()-1);
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return list.size()==0;
    }
    
    public boolean isFull() {
        return list.size()==size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */