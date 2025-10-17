class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int result=0,sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            if(num%2!=0) sum++;
            if(map.containsKey(sum-k)) result+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }       
        return result;
    }
}