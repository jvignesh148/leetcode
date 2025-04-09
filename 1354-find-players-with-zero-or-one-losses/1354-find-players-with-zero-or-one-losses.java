class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> res1=new ArrayList<>();
        HashMap<Integer,Integer> w1=new HashMap<>();
        List<Integer> res2=new ArrayList<>();
        HashMap<Integer,Integer> w2=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            w1.put(matches[i][0],w1.getOrDefault(matches[i][0],0)+1);
            w2.put(matches[i][1],w2.getOrDefault(matches[i][1],0)+1);
        }
        for(int m : w1.keySet()){
            if(!w2.containsKey(m)) res1.add(m);
        }
        for(int m : w2.keySet()){
            if(w2.get(m)==1) res2.add(m);
        }
        Collections.sort(res1);
        Collections.sort(res2);
        list.add(res1);
        list.add(res2);
        return list;
    }
}