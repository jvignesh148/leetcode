class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int m : map.keySet()){
            if(m==map.get(m)) l.add(m);
        }
        Collections.sort(l);
        if(l.size()!=0) return l.get(l.size()-1);
        return -1;
    }
}