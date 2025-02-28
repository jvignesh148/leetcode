class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] n=new int[nums.length];
        int ind=0;
        for(int i=n.length-k;i<n.length ;i++){
            n[ind]=nums[i];
            ind+=1;
        }
        for(int i=0;i<n.length-k;i++){
            n[ind]=nums[i];
            ind+=1;
        }
        for(int i=0;i<n.length;i++){
            nums[i]=n[i];
        }
    }
}