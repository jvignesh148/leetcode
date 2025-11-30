class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length,result = n;
        long sum = 0;
        for(int num : nums) sum = (sum + num) % p;
        if(sum == 0) return 0;
        long ness = sum, pref = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L , -1);
        for(int i = 0; i < n; i++) {
            pref = (pref + nums[i]) % p; 
            long tar = (pref - ness + p) % p;
            if(map.containsKey(tar)) result = Math.min(result, i - map.get(tar));
            map.put(pref, i);
        }
        return result == n ? -1 : result;  
    }
}