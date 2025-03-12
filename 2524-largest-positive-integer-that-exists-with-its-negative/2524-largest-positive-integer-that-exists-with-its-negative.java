class Solution {
    public int findMaxK(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int num : nums) {
            if(num>0) l.add(num);
        }
        Arrays.sort(nums);
        for(int n : nums){
            if(l.contains(Math.abs(n)) && n<0) return Math.abs(n);
        }
        return -1;
    }
}