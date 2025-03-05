class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] n=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsValue(nums[i])){
                map.put(i,nums[i]);
            }
            else {
                n[ind]=nums[i];
                ind+=1;
            }
        }
        Arrays.sort(n);
        return n;
    }
}