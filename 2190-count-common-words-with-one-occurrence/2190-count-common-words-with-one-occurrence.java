class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String word : words1) map.put(word,map.getOrDefault(word,0)+1);
        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        for(String m : map.keySet()){
            if(map.get(m)==1) l1.add(m);
        }
        map.clear();
        for(String word : words2) map.put(word,map.getOrDefault(word,0)+1);
        for(String m : map.keySet()){
            if(map.get(m)==1) l2.add(m);
        }
        map.clear();
        for(String word : l1) map.put(word,map.getOrDefault(word,0)+1);
        for(String word : l2) map.put(word,map.getOrDefault(word,0)+1);
        int count=0;
        for(String m : map.keySet()){
            if(map.get(m)==2) count+=1;
        }
        return count;
    }
}