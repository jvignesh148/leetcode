class RandomizedCollection {
    Map<Integer,Integer> map;
    List<Integer> list=new ArrayList<>();
    Random rand=new Random();
    public RandomizedCollection() {
        map=new HashMap<>();
    }
    
    public boolean insert(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        list.add(val);
        return map.get(val)==1;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        list.remove(Integer.valueOf(val));
        if(map.get(val)>1) {
            map.put(val,map.get(val)-1);
        }
        else map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */