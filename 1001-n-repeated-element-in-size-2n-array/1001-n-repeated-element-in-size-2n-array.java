class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int m: map.keySet()){
            if(map.get(m)==(int) nums.length/2) return m;
        }
        return 0;
    }
}