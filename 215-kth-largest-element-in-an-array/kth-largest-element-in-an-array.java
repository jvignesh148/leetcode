class Solution {
    public int findKthLargest(int[] nums, int k) {
        int j=1;
        int res=0;
        Arrays.sort(nums);
        /*HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsValue(nums[i])){
                map.put(j,nums[i]);
                j++;
            }
        }*/
        return nums[nums.length-k];
    }
}