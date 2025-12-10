class Solution {
    public int specialTriplets(int[] nums) {
        int MOD = 1000000007;
        long result = 0, n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> past = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int i = 0; i < n; i++) {
            int mid = nums[i];
            if(map.get(nums[i]) == 1) map.remove(nums[i]);
            else map.put(mid, map.get(mid) - 1);
            int target = nums[i] * 2;
            if(map.containsKey(target) && past.containsKey(target)) {
                long left = past.get(target), right = map.get(target);
                result = (result + left * right) % MOD;
            }
            past.put(nums[i], past.getOrDefault(nums[i], 0) + 1);
        }
        return (int) result;
    }
}