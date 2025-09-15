class LFUCache {
    private HashMap<Integer,Integer> map=new HashMap<>();
    private HashMap<Integer,Integer> freq=new HashMap<>();
    private Map<Integer, LinkedHashSet<Integer>> lists=new HashMap<>();
    int size;
    int minFreq=0;
    public LFUCache(int capacity) {
        size=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        increaseFreq(key);
        return map.get(key); 
    }
    
    public void put(int key, int value) {
        if(size==0)return;
        if(map.containsKey(key)){
            increaseFreq(key);
            map.put(key,value);
            return;
        }
        if(map.size()>=size){
            int evict=lists.get(minFreq).iterator().next();
            lists.get(minFreq).remove(evict);
            map.remove(evict);
            freq.remove(evict);
        }
        map.put(key,value);
        freq.put(key,1);
        minFreq=1;
        lists.computeIfAbsent(1,k->new LinkedHashSet<>()).add(key);
    }
    private void increaseFreq(int key){
        int f=freq.get(key);
        freq.put(key,f+1);
        lists.get(f).remove(key);
        if(f==minFreq&&lists.get(f).isEmpty())minFreq++;
        lists.computeIfAbsent(f+1,k->new LinkedHashSet<>()).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */