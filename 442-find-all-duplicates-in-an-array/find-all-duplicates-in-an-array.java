class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s.add(nums[i])){
                l.add(nums[i]);
            }
        }
        return l;
    }
}