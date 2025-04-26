class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n : nums) map.put(n,map.getOrDefault(n,0)+1);
        for(int i : nums){
            if(!map.containsKey(i-1) && !map.containsKey(i+1) && map.get(i)==1) l.add(i);
        }
        return l;
    }
}