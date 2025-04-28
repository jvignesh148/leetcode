class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i : nums){
            if(i>pivot) l2.add(i);
            else if(pivot>i)l1.add(i);
        }
        int index=0;
        int m=nums.length-l1.size()-l2.size();
        for(int i : l1) nums[index++]=i;
        for(int i=0;i<m;i++) nums[index++]=pivot;
        for(int i : l2) nums[index++]=i;
        return nums;
    }
}