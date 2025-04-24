class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> l=new ArrayList<>();
        for(String word : words) map.put(word,map.getOrDefault(word,0)+1);
        int i=0;
        while(i<k){
            int max=0;
            String val="";
            for(String m : map.keySet()) {
                if(map.get(m) > max || (map.get(m) == max && m.compareTo(val) < 0)){
                    max=map.get(m);
                    val=m;
                }
            }
            l.add(val);
            map.remove(val);
            i++;
        }
        return l;
    }
}