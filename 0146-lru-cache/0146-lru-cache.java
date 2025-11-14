class LRUCache {
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
    List<Integer> list=new ArrayList<>();
    int size=0;
    public LRUCache(int capacity) {
        size=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        int result=map.get(key);
        map.remove(key);
        list.remove(Integer.valueOf(key));
        list.add(key);
        map.put(key,result);
        return result;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            list.remove(Integer.valueOf(key));
            list.add(key);
        }
        else if(map.size()<size) {
            map.put(key,value);
            list.add(key);
        }
        else{
            map.remove(list.get(0));
            map.put(key,value);
            list.remove(0);
            list.add(key);
        } 
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */