class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int m : map.keySet()){
            if(map.get(m)>(nums.length/3)){
                l.add(m);
            }
        }

        return l;
    }
}