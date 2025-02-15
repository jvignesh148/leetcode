class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int j:map.keySet()){
            if(map.get(j)==1) l.add(j);
        }
        int[] n=new int[l.size()];
        for(int i=0;i<l.size();i++){
            n[i]=l.get(i);
        }
        return n;
    }
}