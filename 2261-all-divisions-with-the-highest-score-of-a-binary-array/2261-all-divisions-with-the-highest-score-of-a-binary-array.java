class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int left=0,right=0;
        for(int num : nums) {
            if(num==1) right++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(left+right);
            if(nums[i]==0) left++;
            else right--;
        }
        list.add(left+right);
        List<Integer> result=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        for(int val : list) min=Math.max(min,val);
        for(int i=0;i<list.size();i++) if(list.get(i)==min) result.add(i);
        return result;
    }
}