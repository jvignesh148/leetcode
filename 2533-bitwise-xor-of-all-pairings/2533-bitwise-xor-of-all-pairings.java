class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res1=0,res2=0;
        for(int num : nums1) res1^=num;
        for(int num : nums2) res2^=num;
        return (nums2.length%2== 1 ? res1 : 0)^(nums1.length%2==1 ? res2 : 0 );
    }
}